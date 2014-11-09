package org.apache.cassandra.db;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.io.IVersionedSerializer;
import org.apache.cassandra.io.util.DataOutputPlus;
import org.apache.cassandra.net.MessageOut;
import org.apache.cassandra.net.MessagingService;
import org.apache.cassandra.service.RowDataResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartReadAndShuffleCommand  {

	private static final Logger logger = LoggerFactory.getLogger(StartReadAndShuffleCommand.class);

	public static final StartReadAndShuffleCommandSerializer serializer = new StartReadAndShuffleCommandSerializer();

    public MessageOut<StartReadAndShuffleCommand> createMessage()
    {
        return new MessageOut<>(MessagingService.Verb.CONTROL_START_RS, this, serializer);
    }

    public int travelId = 0;
    public int stepId = 0;
    public int totalStep = 0;
    
    public StartReadAndShuffleCommand(){
    }
    
    public StartReadAndShuffleCommand(int travelId, int stepId, int totalStep){
    	this.travelId = travelId;
    	this.stepId = stepId;
    	this.totalStep = totalStep;
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
}

class StartReadAndShuffleCommandSerializer implements IVersionedSerializer<StartReadAndShuffleCommand>
{
    public void serialize(StartReadAndShuffleCommand command, DataOutputPlus out, int version) throws IOException
    {
    	out.writeInt(command.travelId);
    	out.writeInt(command.stepId);
    	out.writeInt(command.totalStep);
    }

    public StartReadAndShuffleCommand deserialize(DataInput in, int version) throws IOException
    {
    	StartReadAndShuffleCommand tc = new StartReadAndShuffleCommand();
    	tc.travelId = in.readInt();
    	tc.stepId = in.readInt();
    	tc.totalStep = in.readInt();
    	return tc;
    }

    public long serializedSize(StartReadAndShuffleCommand command, int version)
    {
        long size = 3*4;
        return size;
    }
}