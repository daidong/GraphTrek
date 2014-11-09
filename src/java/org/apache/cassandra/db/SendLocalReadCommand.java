package org.apache.cassandra.db;

import java.io.DataInput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.io.IVersionedSerializer;
import org.apache.cassandra.io.util.DataOutputPlus;
import org.apache.cassandra.net.MessageOut;
import org.apache.cassandra.net.MessagingService;
import org.apache.cassandra.service.RowDataResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SendLocalReadCommand {

	private static final Logger logger = LoggerFactory.getLogger(SendLocalReadCommand.class);

	public static final SendLocalReadCommandSerializer serializer = new SendLocalReadCommandSerializer();

    public MessageOut<SendLocalReadCommand> createMessage()
    {
        return new MessageOut<>(MessagingService.Verb.SEND_LOCAL_READ, this, serializer);
    }

    /**
     * Currently, we put all the steps into one TravelCommand and leave all the complex execution in StorageProxy. 
     * In each step, it is actually a ReadCommand list, for the 2, 3, 4 steps, it actually runs based on ungiven 
     * partition keys.
     */
    public int travelId = 0;
    public int stepId = 0;
    public int size = 0;
    //public boolean keyOrReads = false;
    //public List<ByteBuffer> keys = new ArrayList<>();
    public List<ReadCommand> reads = new ArrayList<ReadCommand>();
    
    public SendLocalReadCommand(){
    }
    
    public SendLocalReadCommand(int travelId, int stepId, List<ReadCommand> inputs){
    	this.travelId = travelId;
    	this.stepId = stepId;
    	this.size = inputs.size();
    	this.reads = inputs;
    }
    
    // maybeGenerateRetryCommand is used to generate a retry for short reads
    public ReadCommand maybeGenerateRetryCommand(RowDataResolver resolver, Row row)
    {
        return null;
    }

    // maybeTrim removes columns from a response that is too long
    public void maybeTrim(Row row)
    {
        // noop
    }

    public long getTimeout()
    {
        return DatabaseDescriptor.getReadRpcTimeout();
    }
    
    public void addReadCommand(ReadCommand rc){
    	this.reads.add(rc);
    }
}

class SendLocalReadCommandSerializer implements IVersionedSerializer<SendLocalReadCommand>
{
    public void serialize(SendLocalReadCommand command, DataOutputPlus out, int version) throws IOException
    {
    	out.writeInt(command.travelId);
    	out.writeInt(command.stepId);
    	out.writeInt(command.size);
    	for (int i = 0; i < command.size; i++)
    	{
    		ReadCommand.serializer.serialize(command.reads.get(i), out, version);
    	}
    }

    public SendLocalReadCommand deserialize(DataInput in, int version) throws IOException
    {
    	SendLocalReadCommand tc = new SendLocalReadCommand();
    	tc.travelId = in.readInt();
    	tc.stepId = in.readInt();
    	tc.size = in.readInt();
    	//tc.keyOrReads = in.readBoolean();
    	for (int i = 0; i < tc.size; i++)
    	{
    		/*
    		if (tc.keyOrReads){
    			ByteBuffer key = null;
    			tc.keys.add(key);
    		}
    		else{
    		*/
    		ReadCommand rc = ReadCommand.serializer.deserialize(in, version);
    		tc.addReadCommand(rc);

    	}
    	return tc;
    }

    public long serializedSize(SendLocalReadCommand command, int version)
    {
        long size = 12;
        for (int i = 0; i < command.size; i++){
        	size += ReadCommand.serializer.serializedSize(command.reads.get(i), version);
        }
        return size;
    }
}
