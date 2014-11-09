package org.apache.cassandra.cql3.statements;

import com.google.common.base.*;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;

import org.apache.cassandra.auth.Permission;
import org.apache.cassandra.config.CFMetaData;
import org.apache.cassandra.config.ColumnDefinition;
import org.apache.cassandra.cql3.*;
import org.apache.cassandra.db.Cell;
import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.ConsistencyLevel;
import org.apache.cassandra.db.RangeSliceCommand;
import org.apache.cassandra.db.ReadCommand;
import org.apache.cassandra.db.Row;
import org.apache.cassandra.db.TravelCommand;
import org.apache.cassandra.db.composites.CBuilder;
import org.apache.cassandra.db.composites.CType;
import org.apache.cassandra.db.composites.CellName;
import org.apache.cassandra.db.composites.Composite;
import org.apache.cassandra.db.composites.Composites;
import org.apache.cassandra.db.composites.CompositesBuilder;
import org.apache.cassandra.db.composites.Composite.EOC;
import org.apache.cassandra.db.filter.ColumnSlice;
import org.apache.cassandra.db.filter.IDiskAtomFilter;
import org.apache.cassandra.db.filter.NamesQueryFilter;
import org.apache.cassandra.db.filter.SliceQueryFilter;
import org.apache.cassandra.db.marshal.CollectionType;
import org.apache.cassandra.db.marshal.CompositeType;
import org.apache.cassandra.db.marshal.Int32Type;
import org.apache.cassandra.db.marshal.MapType;
import org.apache.cassandra.exceptions.InvalidRequestException;
import org.apache.cassandra.exceptions.RequestExecutionException;
import org.apache.cassandra.exceptions.RequestValidationException;
import org.apache.cassandra.exceptions.UnauthorizedException;
import org.apache.cassandra.service.ClientState;
import org.apache.cassandra.service.QueryState;
import org.apache.cassandra.service.StorageProxy;
import org.apache.cassandra.service.StorageService;
import org.apache.cassandra.service.pager.Pageable;
import org.apache.cassandra.thrift.ThriftValidation;
import org.apache.cassandra.transport.messages.ResultMessage;
import org.apache.cassandra.utils.ByteBufferUtil;
import org.apache.cassandra.utils.FBUtilities;
import org.github.jamm.MemoryMeter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;
import java.util.*;

/**
 * Created by daidong on 9/26/14.
 * Encapsulates a completely parsed TRAVEL query.
 */
public class TravelStatement implements CQLStatement, MeasurableForPreparedCache
{
    private static final Logger logger = LoggerFactory.getLogger(TravelStatement.class);

    private final CFMetaData cfm;
    
    private final List<Relation> startwclause;
    private final List<EdgeSelector> paths;

    private Selection selection = null;
    
    /** Restrictions on partitioning columns */
    private final List<Restriction[]> allKeyRestrictions;

    /** Restrictions on clustering columns */
    private final List<Restriction[]> allColumnRestrictions;
    
    private final Set<ColumnDefinition> restrictedColumns = new HashSet<ColumnDefinition>();

	private boolean isReversed = false;

	private final int limit = Integer.MAX_VALUE;
    
    public TravelStatement(CFMetaData cfm, List<Relation> startwclause, 
    		List<EdgeSelector> paths){
        this.cfm = cfm;
        this.startwclause = startwclause;
        this.paths = paths;
        this.allKeyRestrictions = new ArrayList<Restriction[]>();
        this.allColumnRestrictions = new ArrayList<Restriction[]>();
        /*
        this.keyRestrictions = new Restriction[cfm.partitionKeyColumns().size()];
        this.columnRestrictions = new Restriction[cfm.clusteringColumns().size()];
        */
        ColumnIdentifier dstId = new ColumnIdentifier("dstid", false);
        RawSelector rs = new RawSelector(dstId, null);
        List<RawSelector> selectClause = new ArrayList<RawSelector>();
        selectClause.add(rs);
        try {
			this.selection = Selection.fromSelectors(cfm, selectClause);
		} catch (InvalidRequestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public int getBoundTerms() {
        return 0;
    }

    @Override
    public void checkAccess(ClientState state) throws UnauthorizedException, InvalidRequestException {
        state.hasColumnFamilyAccess(keyspace(), columnFamily(), Permission.SELECT);    	
    }

    @Override
    public void validate(ClientState state) throws RequestValidationException {
        // Nothing to do, all validation has been done by RawStatement.prepare()
    }

    public String keyspace()
    {
        return cfm.ksName;
    }
    
    public String columnFamily()
    {
        return cfm.cfName;
    }
    
    private Pageable getPageableCommand(QueryOptions options, long now) throws RequestValidationException
    {
    	int steps = this.paths.size();
    	logger.info("@daidong debug: getPageableCommand: " + steps);
    	TravelCommand tc = new TravelCommand();
    	for (int i = 0; i < steps; i++){
    		List<ReadCommand> commands = getSliceTravelCommands(options, now, i);
    		if (commands != null)
    			tc.addReadCommands(commands);
    	}
    	return tc;
    }
	
    private List<ReadCommand> getSliceTravelCommands(QueryOptions options, long now, int step) throws RequestValidationException
    {
    	List<ReadCommand> commands = new ArrayList<>();

    	Collection<ByteBuffer> keys = getKeys(options, step);
        //if (keys.isEmpty()) // in case of IN () for (the last column of) the partition key.
        
    	IDiskAtomFilter filter = makeFilter(options, step);
        if (filter == null)
            return null;

        if (keys.isEmpty()){
        	//if we do not have keys yet, just create a Read Command with empty key.
        	ByteBuffer empty = ByteBuffer.wrap("EMPTY".getBytes());
        	//logger.info("@daidong debug: create read command with empty key ");
        	commands.add(ReadCommand.create(keyspace(), ByteBufferUtil.clone(empty), columnFamily(), now, filter.cloneShallow()));
        } else {
        	for (ByteBuffer key : keys)
        	{
        		QueryProcessor.validateKey(key);
        		//logger.info("@daidong debug: create read command with keys " + key.toString());
        		commands.add(ReadCommand.create(keyspace(), ByteBufferUtil.clone(key), columnFamily(), now, filter.cloneShallow()));
        	}
        }
        return commands;
    }
    
    /*
     * @daidong
     * According to the values stored in QueryOptions to get the values for each partition key.
     */
    private Collection<ByteBuffer> getKeys(final QueryOptions options, int step) throws InvalidRequestException
    {
    	
        List<ByteBuffer> keys = new ArrayList<ByteBuffer>();
        if (step > 0)
    		return keys;
    	
        CBuilder builder = cfm.getKeyValidatorAsCType().builder();
        for (ColumnDefinition def : cfm.partitionKeyColumns())
        {
            Restriction r = allKeyRestrictions.get(step)[def.position()];
            assert r != null && !r.isSlice();

            List<ByteBuffer> values = r.values(options);
            
            if (builder.remainingCount() == 1)
            {
                for (ByteBuffer val : values)
                {
                    if (val == null)
                        throw new InvalidRequestException(String.format("Invalid null value for partition key part %s", def.name));
                    logger.info("@daidong debug: " + "get values: " + builder.buildWith(val).toByteBuffer().toString());
                    keys.add(builder.buildWith(val).toByteBuffer());
                }
            }
            else
            {
                // Note: for backward compatibility reasons, we let INs with 1 value slide
            	//@daidong: if there are multiple values, it must be the IN operation and has to be at the end of the statement.
                if (values.size() != 1)
                    throw new InvalidRequestException("IN is only supported on the last column of the partition key");
                ByteBuffer val = values.get(0);
                if (val == null)
                    throw new InvalidRequestException(String.format("Invalid null value for partition key part %s", def.name));
                builder.add(val);
            }
        }
        return keys;
    }
    

    private static ByteBuffer getSliceValue(Restriction r, Bound b, QueryOptions options) throws InvalidRequestException
    {
        Restriction.Slice slice = (Restriction.Slice)r;
        assert slice.hasBound(b);
        ByteBuffer val = slice.bound(b, options);
        if (val == null)
            throw new InvalidRequestException(String.format("Invalid null clustering key part %s", r));
        return val;
    }
    
    private List<Composite> getRequestedBound(Bound b, QueryOptions options, int step) throws InvalidRequestException
    {
        return buildBound(b, cfm.clusteringColumns(), allColumnRestrictions.get(step), false, cfm.comparator, options);
    }
    private static boolean isNullRestriction(Restriction r, Bound b)
    {
        return r == null || (r.isSlice() && !((Restriction.Slice)r).hasBound(b));
    }
	private static List<Composite> buildBound(Bound bound,
			List<ColumnDefinition> defs, Restriction[] restrictions,
			boolean isReversed, CType type, QueryOptions options)
			throws InvalidRequestException {

		CBuilder builder = type.builder();

		CompositesBuilder compositeBuilder = new CompositesBuilder(builder,
				isReversed ? type.reverseComparator() : type);
	
		// @daidong We iterate all column definition (the cluster columns) and check whether
		// there are restrictions on them. Remember EQ indicates compositeBuilder.addEachElementToAll()
		// and <, >, <=, and >= indicate the slice restriction.
		Bound eocBound = isReversed ? Bound.reverse(bound) : bound;
		for (Iterator<ColumnDefinition> iter = defs.iterator(); iter.hasNext();) {
			ColumnDefinition def = iter.next();

			Bound b = bound;
			Restriction r = restrictions[def.position()];
			
			if (isNullRestriction(r, b)) {
				EOC eoc = !compositeBuilder.isEmpty() && eocBound == Bound.END ? EOC.END
						: EOC.NONE;
				//@daidong Because it returns once find a cluster column does not have
				//restrictions, so, Cassandra only supports restrictions sequentially (NO JUMP)
				return compositeBuilder.buildWithEOC(eoc);
			}
			if (r.isSlice()) {
				compositeBuilder.addElementToAll(getSliceValue(r, b, options));
				Relation.Type relType = ((Restriction.Slice) r).getRelation(
						eocBound, b);
				return compositeBuilder.buildWithEOC(eocForRelation(relType));
			}

			compositeBuilder.addEachElementToAll(r.values(options));

			if (compositeBuilder.containsNull())
				throw new InvalidRequestException(String.format(
						"Invalid null clustering key part %s", def.name));
		}
		EOC eoc = eocBound == Bound.END && compositeBuilder.hasRemaining() ? EOC.END
				: EOC.NONE;
		return compositeBuilder.buildWithEOC(eoc);
	}

	private static Composite.EOC eocForRelation(Relation.Type op)
    {
        switch (op)
        {
            case LT:
                // < X => using startOf(X) as finish bound
                return Composite.EOC.START;
            case GT:
            case LTE:
                // > X => using endOf(X) as start bound
                // <= X => using endOf(X) as finish bound
                return Composite.EOC.END;
            default:
                // >= X => using X as start bound (could use START_OF too)
                // = X => using X
                return Composite.EOC.NONE;
        }
    }

	private SliceQueryFilter sliceFilter(ColumnSlice[] slices, int limit, int toGroup)
    {
        assert ColumnSlice.validateSlices(slices, cfm.comparator, isReversed) : String.format("Invalid slices: " + Arrays.toString(slices) + (isReversed ? " (reversed)" : ""));
        return new SliceQueryFilter(slices, isReversed, limit, toGroup);
    }
	
	private IDiskAtomFilter makeFilter(QueryOptions options, int step) throws InvalidRequestException {

		int toGroup = cfm.comparator.isDense() ? -1 : cfm.clusteringColumns().size();
		//logger.info("@daidong debug: " + "in makeFilter. toGroup: " + toGroup);
		
		List<Composite> startBounds = getRequestedBound(Bound.START, options, step);
		List<Composite> endBounds = getRequestedBound(Bound.END, options, step);
		assert startBounds.size() == endBounds.size();

		List<ColumnSlice> l = new ArrayList<ColumnSlice>(startBounds.size());
		for (int i = 0; i < startBounds.size(); i++) {
			ColumnSlice slice = new ColumnSlice(startBounds.get(i), endBounds.get(i));
			if (!slice.isAlwaysEmpty(cfm.comparator, isReversed))
				l.add(slice);
		}

		if (l.isEmpty())
			return null;

		return sliceFilter(l.toArray(new ColumnSlice[l.size()]), limit, toGroup);

	}

	@Override
    public ResultMessage.Rows execute(QueryState state, QueryOptions options) throws RequestValidationException, RequestExecutionException {
        ConsistencyLevel cl = options.getConsistency();
        if (cl == null)
            throw new InvalidRequestException("Invalid empty consistency level");
        cl.validateForRead(keyspace());

        //@daidong currently, we just ignore the repeat clause because i have not figured out how to map Term to Int yet. :(
        long now = System.currentTimeMillis();
        Pageable command = getPageableCommand(options, now);
        
        /*
        TravelCommand tc = (TravelCommand)command;
        logger.info("@daidong debug: travel comand: " + tc.id + ":" + tc.steps + ":" + tc.readPath.size());
        for (int i = 0; i < tc.readPath.size(); i++){
        	for (int j = 0; j < tc.readPath.get(i).size(); j++){
        		logger.info("@daidong debug: travel command: " + tc.readPath.get(i).get(j));
        	}
        }
        */
        long start = System.nanoTime();
        ResultMessage.Rows rtn = execute(command, options, limit, now);
        logger.info("time: " + ((double)(System.nanoTime() - start)/1000000000.0));
        return rtn;        
    }

    /*
     * @daidong The core function of a statement instance. It will execute the Pageable command we 
     * get from users' inputs. The return is ResultMessage.Row instance. 
     */
    private ResultMessage.Rows execute(Pageable command, QueryOptions options, int limit, long now) throws RequestValidationException, RequestExecutionException
    {
        List<Row> trows;
        if (command == null)
            trows = Collections.<Row>emptyList();
        else
        	trows = StorageProxy.travel(((TravelCommand) command), options.getConsistency());        	
        return processResults(trows, options, limit, now);
    }
    
    public ResultMessage.Rows processResults(List<Row> rows, QueryOptions options, int limit, long now) throws RequestValidationException
    {
        // Even for count, we need to process the result as it'll group some column together in sparse column families
        ResultSet rset = process(rows, options, limit, now);
        ResultMessage.Rows rtn = new ResultMessage.Rows(rset);
        //logger.info("@daidong debug: get results: " + rtn.toString());
        return rtn;
    }
    
    private ResultSet process(List<Row> rows, QueryOptions options, int limit, long now) throws InvalidRequestException
    {
        Selection.ResultSetBuilder result = selection.resultSetBuilder(now);
        for (org.apache.cassandra.db.Row row : rows)
        {
            // Not columns match the query, skip
            if (row.cf == null)
                continue;

            processColumnFamily(row.key.getKey(), row.cf, options, now, result);
        }
        ResultSet cqlRows = result.build();
        
        return cqlRows;
    }
    
    void processColumnFamily(ByteBuffer key, ColumnFamily cf, QueryOptions options, long now, Selection.ResultSetBuilder result)
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

    	// If there is static columns but there is no non-static row, then provided the select was a full
    	// partition selection (i.e. not a 2ndary index search and there was no condition on clustering columns)
    	// then we want to include the static columns in the result set (and we're done).
    	CQL3Row staticRow = iter.getStaticRow();
    	if (staticRow != null && !iter.hasNext()) //&& hasNoClusteringColumnsRestriction()
    	{
    		result.newRow();
    		for (ColumnDefinition def : selection.getColumns())
    		{
    			switch (def.kind)
    			{
    			case PARTITION_KEY:
    				result.add(keyComponents[def.position()]);
    				break;
    			default:
    				result.add((ByteBuffer)null);
    			}
    		}
    		return;
    	}

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
    				addValue(result, def, cql3Row, options);
    				break;
    			}
    		}
    	}
    }

    private static void addValue(Selection.ResultSetBuilder result, ColumnDefinition def, CQL3Row row, QueryOptions options)
    {
        if (row == null)
        {
            result.add((ByteBuffer)null);
            return;
        }

        if (def.type.isCollection())
        {
            List<Cell> collection = row.getCollection(def.name);
            ByteBuffer value = collection == null
                             ? null
                             : ((CollectionType)def.type).serializeForNativeProtocol(collection, options.getProtocolVersion());
            result.add(value);
            return;
        }

        result.add(row.getColumn(def.name));
    }
    
    @Override
    public ResultMessage executeInternal(QueryState state, QueryOptions options) throws RequestValidationException, RequestExecutionException {
        logger.info("In Internal Execute");
        ResultMessage.Void nt = new ResultMessage.Void();
        return nt;
    }

    @Override
    public long measureForPreparedCache(MemoryMeter meter) {
    	return meter.measure(this)
                + meter.measureDeep(startwclause)
                + meter.measureDeep(paths)
    	        + meter.measureDeep(allKeyRestrictions)
                + meter.measureDeep(allColumnRestrictions)
                + meter.measureDeep(restrictedColumns);
        /*
                + meter.measureDeep(metadataRestrictions)
                + (sliceRestriction == null ? 0 : meter.measureDeep(sliceRestriction))
                + (orderingIndexes == null ? 0 : meter.measureDeep(orderingIndexes));
                */
    }

    public static class RawStatement extends CFStatement
    {
        private final List<Relation> startwclause;
        private final List<EdgeSelector> paths;
        private final Term.Raw repeats;

        public RawStatement(CFName cfName, 
        		List<Relation> startwclause, 
        		List<EdgeSelector> paths,
        		Term.Raw repeats)
        {
            super(cfName);
            
            logger.info("@daidong debug: " + cfName.toString());
            for (int i = 0; i < paths.size(); i++){
            	logger.info("@daidong debug: " + paths.get(i).toString());
            }
            
            this.startwclause = startwclause == null ? Collections.<Relation>emptyList() : startwclause;
            this.paths = paths == null ? Collections.<EdgeSelector>emptyList() : paths;
            this.repeats = repeats;
        }

        /**
         * @daidong In this prepare function, we do not do any check yet, so currently the users should make sure their 
         * statements are correct.
         */
        public ParsedStatement.Prepared prepare() throws InvalidRequestException
        {
            CFMetaData cfm = ThriftValidation.validateColumnFamily(keyspace(), columnFamily());
            VariableSpecifications boundNames = getBoundVariables();
            
            TravelStatement stmt = new TravelStatement(cfm, startwclause, paths);
            
            List<List<Relation>> whereRelations = new ArrayList<List<Relation>>();

            // This is the first read command
            // Note that: the EdgeWhere is after 'through', EndWhere is after 'to'.
            for (Relation r : paths.get(0).getEdgeWhere())
            	startwclause.add(r);
            whereRelations.add(startwclause);
            
            for (int i = 0; i < paths.size(); i++){
            	int nextPath = i + 1;
            	List<Relation> pathwclause = paths.get(i).getEndWhere();
            	if (nextPath < paths.size()){
            		for (Relation r : paths.get(nextPath).getEdgeWhere()){
            			pathwclause.add(r);
            		}
            	}
            	whereRelations.add(pathwclause);
            }
            
        	//for (int i = 0; i < paths.size(); i++){
            for (int i = 0; i < whereRelations.size(); i++){
                Restriction[] keyRestrictions = new Restriction[cfm.partitionKeyColumns().size()];
            	Restriction[] columnRestrictions = new Restriction[cfm.clusteringColumns().size()];

        		for (Relation relation : whereRelations.get(i))
        		{
        			SingleColumnRelation rel = (SingleColumnRelation) relation;
        			ColumnIdentifier entity = rel.getEntity();
        			ColumnDefinition def = cfm.getColumnDefinition(entity);

        			switch (def.kind)
        			{
        			case PARTITION_KEY:
        				keyRestrictions[def.position()] = updateSingleColumnRestriction(def, keyRestrictions[def.position()], rel, boundNames);
        				break;
        			case CLUSTERING_COLUMN:
        				columnRestrictions[def.position()] = updateSingleColumnRestriction(def, columnRestrictions[def.position()], rel, boundNames);
        				break;
        			case COMPACT_VALUE:
        				throw new InvalidRequestException(String.format("Predicates on the non-primary-key column (%s) of a COMPACT table are not yet supported", def.name));
        			case REGULAR:
        			case STATIC:
        				throw new InvalidRequestException(String.format("IN predicates on non-primary-key columns (%s) is not yet supported", def.name));
        			}
        		}
        		stmt.allKeyRestrictions.add(keyRestrictions);
        		stmt.allColumnRestrictions.add(columnRestrictions);
        	}
            return new ParsedStatement.Prepared(stmt, boundNames);
        }

        Restriction updateSingleColumnRestriction(ColumnDefinition def, Restriction existingRestriction, SingleColumnRelation newRel, VariableSpecifications boundNames) throws InvalidRequestException
        {
            ColumnSpecification receiver = def;
            if (newRel.onToken)
            {
                if (def.kind != ColumnDefinition.Kind.PARTITION_KEY)
                    throw new InvalidRequestException(String.format("The token() function is only supported on the partition key, found on %s", def.name));

                receiver = new ColumnSpecification(def.ksName,
                                                   def.cfName,
                                                   new ColumnIdentifier("partition key token", true),
                                                   StorageService.getPartitioner().getTokenValidator());
            }

            // We don't support relations against entire collections, like "numbers = {1, 2, 3}"
            if (receiver.type.isCollection() && !(newRel.operator().equals(Relation.Type.CONTAINS_KEY) || newRel.operator() == Relation.Type.CONTAINS))
            {
                throw new InvalidRequestException(String.format("Collection column '%s' (%s) cannot be restricted by a '%s' relation",
                                                                def.name, receiver.type.asCQL3Type(), newRel.operator()));
            }

            switch (newRel.operator())
            {
                case EQ:
                {
                    if (existingRestriction != null)
                        throw new InvalidRequestException(String.format("%s cannot be restricted by more than one relation if it includes an Equal", def.name));
                    Term t = newRel.getValue().prepare(keyspace(), receiver);
                    t.collectMarkerSpecification(boundNames);
                    existingRestriction = new SingleColumnRestriction.EQ(t, newRel.onToken);
                }
                break;
                case IN:
                    if (existingRestriction != null)
                        throw new InvalidRequestException(String.format("%s cannot be restricted by more than one relation if it includes a IN", def.name));

                    if (newRel.getInValues() == null)
                    {
                        // Means we have a "SELECT ... IN ?"
                        assert newRel.getValue() != null;
                        Term t = newRel.getValue().prepare(keyspace(), receiver);
                        t.collectMarkerSpecification(boundNames);
                        existingRestriction = new SingleColumnRestriction.InWithMarker((Lists.Marker)t);
                    }
                    else
                    {
                        List<Term> inValues = new ArrayList<>(newRel.getInValues().size());
                        for (Term.Raw raw : newRel.getInValues())
                        {
                            Term t = raw.prepare(keyspace(), receiver);
                            t.collectMarkerSpecification(boundNames);
                            inValues.add(t);
                        }
                        existingRestriction = new SingleColumnRestriction.InWithValues(inValues);
                    }
                    break;
                case NEQ:
                    throw new InvalidRequestException(String.format("Unsupported \"!=\" relation on column \"%s\"", def.name));
                case GT:
                case GTE:
                case LT:
                case LTE:
                    {
                        if (existingRestriction == null)
                            existingRestriction = new SingleColumnRestriction.Slice(newRel.onToken);
                        else if (!existingRestriction.isSlice())
                            throw new InvalidRequestException(String.format("Column \"%s\" cannot be restricted by both an equality and an inequality relation", def.name));
                        else if (existingRestriction.isMultiColumn())
                            throw new InvalidRequestException(String.format("Column \"%s\" cannot be restricted by both a tuple notation inequality and a single column inequality (%s)", def.name, newRel));
                        else if (existingRestriction.isOnToken() != newRel.onToken)
                            // For partition keys, we shouldn't have slice restrictions without token(). And while this is rejected later by
                            // processPartitionKeysRestrictions, we shouldn't update the existing restriction by the new one if the old one was using token()
                            // and the new one isn't since that would bypass that later test.
                            throw new InvalidRequestException("Only EQ and IN relation are supported on the partition key (unless you use the token() function)");

                        Term t = newRel.getValue().prepare(keyspace(), receiver);
                        t.collectMarkerSpecification(boundNames);
                        ((SingleColumnRestriction.Slice)existingRestriction).setBound(def.name, newRel.operator(), t);
                    }
                    break;
                case CONTAINS_KEY:
                    if (!(receiver.type instanceof MapType))
                        throw new InvalidRequestException(String.format("Cannot use CONTAINS_KEY on non-map column %s", def.name));
                    // Fallthrough on purpose
                case CONTAINS:
                {
                    if (!receiver.type.isCollection())
                        throw new InvalidRequestException(String.format("Cannot use %s relation on non collection column %s", newRel.operator(), def.name));

                    if (existingRestriction == null)
                        existingRestriction = new SingleColumnRestriction.Contains();
                    else if (!existingRestriction.isContains())
                        throw new InvalidRequestException(String.format("Collection column %s can only be restricted by CONTAINS or CONTAINS KEY", def.name));
                    boolean isKey = newRel.operator() == Relation.Type.CONTAINS_KEY;
                    receiver = makeCollectionReceiver(receiver, isKey);
                    Term t = newRel.getValue().prepare(keyspace(), receiver);
                    t.collectMarkerSpecification(boundNames);
                    ((SingleColumnRestriction.Contains)existingRestriction).add(t, isKey);
                    break;
                }
            }
            return existingRestriction;
        }
        
        private static ColumnSpecification makeCollectionReceiver(ColumnSpecification collection, boolean isKey)
        {
            assert collection.type.isCollection();
            switch (((CollectionType)collection.type).kind)
            {
                case LIST:
                    assert !isKey;
                    return Lists.valueSpecOf(collection);
                case SET:
                    assert !isKey;
                    return Sets.valueSpecOf(collection);
                case MAP:
                    return isKey ? Maps.keySpecOf(collection) : Maps.valueSpecOf(collection);
            }
            throw new AssertionError();
        }
        
        @Override
        public String toString()
        {
            return com.google.common.base.Objects.toStringHelper(this)
                    .toString();
        }
    }

}
