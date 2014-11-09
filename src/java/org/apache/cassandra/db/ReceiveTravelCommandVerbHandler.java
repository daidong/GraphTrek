package org.apache.cassandra.db;

import org.apache.cassandra.net.IVerbHandler;
import org.apache.cassandra.net.MessageIn;
import org.apache.cassandra.net.MessageOut;
import org.apache.cassandra.net.MessagingService;
import org.apache.cassandra.service.StorageService;
import org.apache.cassandra.tracing.Tracing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReceiveTravelCommandVerbHandler implements IVerbHandler<TravelCommand>{

	private static final Logger logger = LoggerFactory.getLogger( ReceiveTravelCommandVerbHandler.class );

    public void doVerb(MessageIn<TravelCommand> message, int id)
    {
        if (StorageService.instance.isBootstrapMode())
        {
            throw new RuntimeException("Cannot service reads while bootstrapping!");
        }
        
        //logger.info("@daidong debug: " + "in ReceiveTravelCommandVerbHandler, " + "store Travel Command Locally!");
        // @daidong For travel command, we just store it into a global mapping. As the MessageService is singlton instance, so we can keep all
        // the travel commands there.
        TravelCommand command = message.payload;
        int commandId = command.id;
        int status = 0;
        logger.info("@daidong debug: " + " ReceiveTravelCommandVerbHandler: " + " command Id: " + commandId + " size: " + command.readPath.size());
        if (!MessagingService.runningTravelCommands.containsKey(commandId))
        	MessagingService.runningTravelCommands.put(commandId, command);
        else 
        	status = 1;
        
        TravelResponse tr = new TravelResponse(commandId, status);

        MessageOut<TravelResponse> reply = new MessageOut<TravelResponse>(MessagingService.Verb.REQUEST_RESPONSE,
                                                                      tr,
                                                                      TravelResponse.serializer);
        Tracing.trace("Enqueuing response to {}", message.from);
        MessagingService.instance().sendReply(reply, id, message.from);
    }
    
}
