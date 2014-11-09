package org.apache.cassandra.db;

import org.apache.cassandra.net.IVerbHandler;
import org.apache.cassandra.net.MessageIn;
import org.apache.cassandra.net.MessageOut;
import org.apache.cassandra.net.MessagingService;
import org.apache.cassandra.service.StorageService;
import org.apache.cassandra.tracing.Tracing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReceiveLocalReadCommandVerbHandler implements IVerbHandler<SendLocalReadCommand>{

	private static final Logger logger = LoggerFactory.getLogger( ReceiveTravelCommandVerbHandler.class );

    public void doVerb(MessageIn<SendLocalReadCommand> message, int id)
    {
        if (StorageService.instance.isBootstrapMode())
            throw new RuntimeException("Cannot service reads while bootstrapping!");
        
        SendLocalReadCommand command = message.payload;
        
        String str = "@daidong debug: " + "ReceiveLocalReadCommandVerbHandler " + "receive Read Commands";
        for (ReadCommand rc : command.reads){
        	str += rc;
        }
        //logger.info(str);
        
        MessagingService.currentLocalReadCommands.put(command.travelId, command.reads);
        MessagingService.currentRunningStep.put(command.travelId, command.stepId);
        
        int status = 0;
        SendLocalReadResponse tr = new SendLocalReadResponse(command.stepId, status);

        MessageOut<SendLocalReadResponse> reply = new MessageOut<SendLocalReadResponse>(MessagingService.Verb.REQUEST_RESPONSE,
                                                                      tr,
                                                                      SendLocalReadResponse.serializer);
        Tracing.trace("Enqueuing response to {}", message.from);
        MessagingService.instance().sendReply(reply, id, message.from);
    }
    
}