/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.cassandra.db;

import java.io.DataInput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.db.filter.IDiskAtomFilter;
import org.apache.cassandra.io.IVersionedSerializer;
import org.apache.cassandra.io.util.DataOutputPlus;
import org.apache.cassandra.net.MessageOut;
import org.apache.cassandra.net.MessagingService;
import org.apache.cassandra.service.RowDataResolver;
import org.apache.cassandra.service.pager.Pageable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author daidong
 * A travel command contains several ReadCommand. We need to execute them one by one.
 */
public class TravelCommand implements Pageable{

    private static final Logger logger = LoggerFactory.getLogger(TravelCommand.class);

	public static final TravelCommandSerializer serializer = new TravelCommandSerializer();
	private static final AtomicInteger idGen = new AtomicInteger(0);

    public MessageOut<TravelCommand> createMessage()
    {
        return new MessageOut<>(MessagingService.Verb.SEND_TRAVEL_COMMAND, this, serializer);
    }

    /**
     * Currently, we put all the steps into one TravelCommand and leave all the complex execution in StorageProxy. 
     * In each step, it is actually a ReadCommand list, for the 2, 3, 4 steps, it actually runs based on ungiven 
     * partition keys.
     */
    
    public int id = 0;
    public int steps = 0;
    public List<List<ReadCommand>> readPath = new ArrayList<List<ReadCommand>>();
    
    public TravelCommand(){
    	this.id = idGen.incrementAndGet();
    	this.steps = 0;
    }
    
    public TravelCommand(List<ReadCommand> inputs){
    	this.id = idGen.incrementAndGet();
    	this.readPath.add(inputs);
    	this.steps = this.readPath.size();
    }
    
    public String ksName(){
    	if (this.readPath.size() > 0)
    		return this.readPath.get(0).get(0).ksName;
    	return null;
    }
    
    public ByteBuffer key(){
    	if (this.readPath.size() > 0)
    		return this.readPath.get(0).get(0).key;
    	return null;
    }
    
    public List<ReadCommand> getStartReadCommands(){
    	return this.readPath.get(0);
    }
    public void addReadCommands(List<ReadCommand> inputs){
    	this.readPath.add(inputs);
    	this.steps = this.readPath.size();
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

class TravelCommandSerializer implements IVersionedSerializer<TravelCommand>
{
	private static final Logger logger = LoggerFactory.getLogger(TravelCommandSerializer.class);
	
    public void serialize(TravelCommand command, DataOutputPlus out, int version) throws IOException
    {
    	out.writeInt(command.id);
    	out.writeInt(command.steps);
    	for (int i = 0; i < command.steps; i++)
    	{
    		int commandNumber = command.readPath.get(i).size();
    		out.writeInt(commandNumber);
    		for (int j = 0; j < commandNumber; j++)
    			ReadCommand.serializer.serialize(command.readPath.get(i).get(j), out, version);
    	}
    }

    public TravelCommand deserialize(DataInput in, int version) throws IOException
    {
    	TravelCommand tc = new TravelCommand();
    	tc.id = in.readInt();
    	int steps = in.readInt();
    	tc.steps = steps;
    	for (int i = 0; i < steps; i++)
    	{
    		int size = in.readInt();
    		List<ReadCommand> readCommandsStepi = new ArrayList<ReadCommand>();
    		for (int j = 0; j < size; j++){
    			ReadCommand rc = ReadCommand.serializer.deserialize(in, version);
    			readCommandsStepi.add(rc);
    		}
    		tc.addReadCommands(readCommandsStepi);
    	}
    	return tc;
    }

    public long serializedSize(TravelCommand command, int version)
    {
        long size = 8;
        for (int i = 0; i < command.steps; i++){
        	int commandNumber = command.readPath.get(i).size();
        	size += 4;
        	
        	for (int j = 0; j < commandNumber; j++){
        		//logger.info("@daidong debug: " + "TravelCommandSerializer " + i + ":" + j);
        		ReadCommand r = command.readPath.get(i).get(j);
        		//logger.info("@daidong debug: " + "TravelCommandSerializer " + r.toString());
        		size += ReadCommand.serializer.serializedSize(r, version);
        	}
        }
        return size;
    }
}
