package org.apache.cassandra.db;

import java.io.DataInput;
import java.io.IOException;

import org.apache.cassandra.io.IVersionedSerializer;
import org.apache.cassandra.io.util.DataOutputPlus;

public class SendLocalReadResponse {
	
	public static final IVersionedSerializer<SendLocalReadResponse> serializer = new SendLocalReadResponseSerializer();

	private final int id;
	private final int status; // 0 indicates Good, 1 indicates uploading the same travel command again; -1 indicates failure
	
	public SendLocalReadResponse(){
		this.id = -1;
		this.status = -1;
	}
	
	public SendLocalReadResponse(int tid, int status){
		this.id = tid;
		this.status = status;
	}
	
	public int getId(){
		return this.id;
	}
	
	public int status(){
		return this.status;
	}
	
}

class SendLocalReadResponseSerializer implements IVersionedSerializer<SendLocalReadResponse>{

	@Override
	public void serialize(SendLocalReadResponse response, DataOutputPlus out, int version)
			throws IOException {
		out.writeInt(response.getId());
		out.writeInt(response.status());
	}

	@Override
	public SendLocalReadResponse deserialize(DataInput in, int version)
			throws IOException {
		return new SendLocalReadResponse(in.readInt(), in.readInt());
	}

	@Override
	public long serializedSize(SendLocalReadResponse t, int version) {
		return 2*4;
	}
	
}
