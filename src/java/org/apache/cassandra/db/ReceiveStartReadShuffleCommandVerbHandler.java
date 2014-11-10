package org.apache.cassandra.db;

import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.cassandra.concurrent.Stage;
import org.apache.cassandra.concurrent.StageManager;
import org.apache.cassandra.config.CFMetaData;
import org.apache.cassandra.config.ColumnDefinition;
import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.cql3.CQL3Row;
import org.apache.cassandra.cql3.ColumnIdentifier;
import org.apache.cassandra.cql3.ColumnSpecification;
import org.apache.cassandra.cql3.Constants;
import org.apache.cassandra.cql3.QueryOptions;
import org.apache.cassandra.cql3.Relation;
import org.apache.cassandra.cql3.ResultSet;
import org.apache.cassandra.cql3.SingleColumnRelation;
import org.apache.cassandra.cql3.Term;
import org.apache.cassandra.cql3.Term.Raw;
import org.apache.cassandra.cql3.statements.RawSelector;
import org.apache.cassandra.cql3.statements.Restriction;
import org.apache.cassandra.cql3.statements.Selection;
import org.apache.cassandra.cql3.statements.SingleColumnRestriction;
import org.apache.cassandra.db.composites.CBuilder;
import org.apache.cassandra.db.composites.CellName;
import org.apache.cassandra.db.marshal.CollectionType;
import org.apache.cassandra.db.marshal.CompositeType;
import org.apache.cassandra.exceptions.InvalidRequestException;
import org.apache.cassandra.exceptions.ReadTimeoutException;
import org.apache.cassandra.exceptions.RequestValidationException;
import org.apache.cassandra.net.IVerbHandler;
import org.apache.cassandra.net.MessageIn;
import org.apache.cassandra.net.MessageOut;
import org.apache.cassandra.net.MessagingService;
import org.apache.cassandra.service.DigestMismatchException;
import org.apache.cassandra.service.ReadCallback;
import org.apache.cassandra.service.RowDigestResolver;
import org.apache.cassandra.service.SendLocalReadCallback;
import org.apache.cassandra.service.StorageProxy;
import org.apache.cassandra.service.StorageService;
import org.apache.cassandra.tracing.Tracing;
import org.apache.cassandra.transport.messages.ResultMessage;
import org.apache.cassandra.utils.FBUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReceiveStartReadShuffleCommandVerbHandler implements IVerbHandler<StartReadAndShuffleCommand>{

	private static final Logger logger = LoggerFactory.getLogger( ReceiveStartReadShuffleCommandVerbHandler.class );
    
    private ResultSet process(List<Row> rows, Selection selection, long now) throws InvalidRequestException
    {
        Selection.ResultSetBuilder result = selection.resultSetBuilder(now);
        for (org.apache.cassandra.db.Row row : rows)
        {
            if (row.cf == null)
                continue;
            processColumnFamily(row.key.getKey(), row.cf, selection, now, result);
        }
        ResultSet cqlRows = result.build();
        return cqlRows;
    }
    
    void processColumnFamily(ByteBuffer key, ColumnFamily cf, Selection selection, long now, Selection.ResultSetBuilder result)
    		throws InvalidRequestException
    {
    	CFMetaData cfm = cf.metadata();
    	ByteBuffer[] keyComponents = null;
    	if (cfm.getKeyValidator() instanceof CompositeType)
    	{
    		keyComponents = ((CompositeType)cfm.getKeyValidator()).split(key);
    	}
    	else
    	{
    		keyComponents = new ByteBuffer[]{ key };
    	}

    	Iterator<Cell> cells = cf.getSortedColumns().iterator();

    	CQL3Row.RowIterator iter = cfm.comparator.CQL3RowBuilder(cfm, now).group(cells);

    	while (iter.hasNext())
    	{
    		CQL3Row cql3Row = iter.next();

    		// Respect requested order
    		result.newRow();
    		// Respect selection order
    		for (ColumnDefinition def : selection.getColumns())
    		{
    			switch (def.kind)
    			{
    			case PARTITION_KEY:
    				result.add(keyComponents[def.position()]);
    				break;
    			case CLUSTERING_COLUMN:
    				result.add(cql3Row.getClusteringColumn(def.position()));
    				break;
    			case COMPACT_VALUE:
    				result.add(cql3Row.getColumn(null));
    				break;
    			case REGULAR:
    				addValue(result, def, cql3Row);
    				break;
    			}
    		}
    	}
    }

    private static void addValue(Selection.ResultSetBuilder result, ColumnDefinition def, CQL3Row row)
    {
        if (row == null)
        {
            result.add((ByteBuffer)null);
            return;
        }
        result.add(row.getColumn(def.name));
    }
    
    public void doVerb(MessageIn<StartReadAndShuffleCommand> message, int id)
    {
        if (StorageService.instance.isBootstrapMode())
        {
            throw new RuntimeException("Cannot service reads while bootstrapping!");
        }
        
        StartReadAndShuffleCommand command = message.payload;
        int travelId = command.travelId;
        int stepId = command.stepId;
        int totalStep = command.totalStep;
        
        List<ReadCommand> currentCommands = MessagingService.currentLocalReadCommands.get(travelId);
        
        List<Row> rows = new ArrayList<Row>();
        Keyspace keyspace = Keyspace.open(currentCommands.get(0).ksName);
    	
        for (ReadCommand c : currentCommands){
        	Row r = c.getRow(keyspace);
        	rows.add(r);
        }

        StartReadAndShuffleResponse tr;
        
        if (stepId == (totalStep - 1)){
        	tr = new StartReadAndShuffleResponse(travelId, 2, rows);

        } else {//shuffle phase.
        	
        	Row r0 = rows.get(0);
        	ColumnFamily cf = r0.cf;
			CFMetaData cfm = cf.metadata();
			
    		Selection selection = null;
            ColumnIdentifier dstId = new ColumnIdentifier("dstid", false);
            RawSelector rs = new RawSelector(dstId, null);
            List<RawSelector> selectClause = new ArrayList<RawSelector>();
            selectClause.add(rs);
	        long now = System.currentTimeMillis();
	        ResultSet rset = null;
	        
            try {
    			selection = Selection.fromSelectors(cfm, selectClause);
				rset = process(rows, selection, now);
			} catch (InvalidRequestException e) {
				e.printStackTrace();
			}

            ArrayList<String> keys = new ArrayList<String>();
            for (List<ByteBuffer> row : rset.rows){
            	for (int i = 0; i < row.size(); i++)
                {
                    ByteBuffer v = row.get(i);
                    keys.add(rset.metadata.names.get(i).type.getString(v));
                    //logger.info("@daidong debug: processed results: " + rset.metadata.names.get(i).type.getString(v));
                }
            }
            List<ByteBuffer> allByteBufferKeys = new ArrayList<ByteBuffer>();
            ColumnIdentifier gId = new ColumnIdentifier("gid", false);
            ColumnDefinition def = cfm.getColumnDefinition(gId);
            ColumnSpecification receiver = def;
            
            /*
            for (String stringKey : keys){
            	Term.Raw v = Constants.Literal.integer(stringKey);            
            	SingleColumnRelation keyRel = new SingleColumnRelation(gId, Relation.Type.EQ, v);
	            Term t = null;
	            try {
	            	t = keyRel.getValue().prepare(cfm.ksName, receiver);
	            } catch (InvalidRequestException e) {
	            	e.printStackTrace();
	            }
	            //t.collectMarkerSpecification(boundNames);
	            SingleColumnRestriction KeyRestriction = new SingleColumnRestriction.EQ(t, keyRel.onToken);
	            CBuilder builder = cfm.getKeyValidatorAsCType().builder();
	            List<ByteBuffer> values = null;
				try {
					values = KeyRestriction.values(null);
				} catch (InvalidRequestException e) {
					e.printStackTrace();
				}
	            
	            //value.bindAndGet(options)
	            ByteBuffer val = values.get(0);
	            allByteBufferKeys.add(builder.buildWith(val).toByteBuffer());
            }
            */
            
             for (String stringKey : keys){
            	Term.Raw v = Constants.Literal.integer(stringKey);            
	            Term t = null;
	            ByteBuffer tmpKey = null;
	            try {
	            	t = v.prepare(cfm.ksName, receiver);
	            	tmpKey = t.bindAndGet(null);
	            } catch (InvalidRequestException e) {
	            	e.printStackTrace();
	            }
	            allByteBufferKeys.add(tmpKey);
            }

            Map<InetAddress, List<ByteBuffer>> distMap = new HashMap<InetAddress, List<ByteBuffer>>();
            TravelCommand thisTravelCommand = MessagingService.runningTravelCommands.get(travelId);
    		List<ReadCommand> nextReadCommands = thisTravelCommand.readPath.get(stepId + 1);
    		
        	for (ByteBuffer k : allByteBufferKeys){
        		
        		//@TODO @daidong. To keep this correct, we need to always keep replica = 1;
            	List<InetAddress> allReplicas = StorageProxy.getLiveSortedEndpoints(keyspace, k);
        		InetAddress targetServer = allReplicas.subList(0, 1).get(0); 
        		logger.info("target server for key: " + k.toString() + " address: " + targetServer.toString());
                
        		if (!distMap.containsKey(targetServer)){
        			List<ByteBuffer> keyToThisServer = new ArrayList<ByteBuffer>();
        			keyToThisServer.add(k);
        			distMap.put(targetServer, keyToThisServer);
        		} else {
        			List<ByteBuffer> keyToThisServer = distMap.get(targetServer);
        			keyToThisServer.add(k);
        		}
        	}

        	//int readCommandSize = 0;
        	for (InetAddress rcTarget : distMap.keySet()){
        		List<ByteBuffer> keyToThisServer = distMap.get(rcTarget);
        		//readCommandSize += keyToThisServer.size();
        	}
        	
    		SendLocalReadCallback<SendLocalReadResponse, Integer> sendLocalReadhandler = new SendLocalReadCallback<>(distMap.size());

    		for (InetAddress rcTarget : distMap.keySet()){
        		List<ByteBuffer> keyToThisServer = distMap.get(rcTarget);
        		List<ReadCommand> sendReadCommands = new ArrayList<ReadCommand>();
        		
        		for (ByteBuffer sendKey:keyToThisServer){
        			for (ReadCommand rc : nextReadCommands){
            			rc.setReadCommandKey(sendKey);
            			ReadCommand withKey = rc.copy();
            			sendReadCommands.add(withKey);
            			//logger.info("@daidong debug:" + " after read command: " + withKey);
            		}            		
        		}
        		SendLocalReadCommand lrcommand = new SendLocalReadCommand(travelId, stepId, sendReadCommands);
        		MessagingService.instance().sendTM(lrcommand.createMessage(), rcTarget, sendLocalReadhandler);
        	}
        	
        	assert sendLocalReadhandler.get() == distMap.size();
        	tr = new StartReadAndShuffleResponse(1, 1, distMap.keySet());
            //tr = new StartReadAndShuffleResponse(travelId, 2, rows);
        }

        logger.info("@daidong debug: " + "local read and shuffle finished!");
        MessageOut<StartReadAndShuffleResponse> reply = new MessageOut<StartReadAndShuffleResponse>(
        															  MessagingService.Verb.REQUEST_RESPONSE,
                                                                      tr,
                                                                      StartReadAndShuffleResponse.serializer);
        Tracing.trace("Enqueuing response to {}", message.from);
        MessagingService.instance().sendReply(reply, id, message.from);
    }
 
    static class LocalReadRunnable extends DroppableRunnable
    {
    	private final ReadCommand command;
        private final ReadCallback<ReadResponse, Row> handler;
        private final long start = System.nanoTime();

        LocalReadRunnable(ReadCommand command, ReadCallback<ReadResponse, Row> handler)
        {
            super(MessagingService.Verb.READ);
            this.command = command;
            this.handler = handler;
        }

        /*
         * @daidong Here is the local read execution logic
         */
        protected void runMayThrow()
        {
        	Keyspace keyspace = Keyspace.open(command.ksName);
            Row r = command.getRow(keyspace);
            ReadResponse result = ReadVerbHandler.getResponse(command, r);
            MessagingService.instance().addLatency(FBUtilities.getBroadcastAddress(), TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start));
            handler.response(result);
        }
    }
    
    private static abstract class DroppableRunnable implements Runnable
    {
        private final long constructionTime = System.nanoTime();
        private final MessagingService.Verb verb;

        public DroppableRunnable(MessagingService.Verb verb)
        {
            this.verb = verb;
        }

        public final void run()
        {

            if (TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - constructionTime) > DatabaseDescriptor.getTimeout(verb))
            {
                MessagingService.instance().incrementDroppedMessages(verb);
                return;
            }
            try
            {
                runMayThrow();
            } catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }

        abstract protected void runMayThrow() throws Exception;
    }
}