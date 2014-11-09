package org.apache.cassandra.db;

import java.io.DataInput;
import java.io.IOException;

import org.apache.cassandra.io.IVersionedSerializer;
import org.apache.cassandra.io.util.DataOutputPlus;

public class TravelResponse {
	public static final IVersionedSerializer<TravelResponse> serializer = new TravelResponseSerializer();

	private final int travelId;
	private final int status; // 0 indicates Good, 1 indicates uploading the same travel command again; -1 indicates failure
	
	public TravelResponse(){
		this.travelId = -1;
		this.status = -1;
	}
	
	public TravelResponse(int tid, int status){
		this.travelId = tid;
		this.status = status;
	}
	
	public int travel(){
		return this.travelId;
	}
	
	public int status(){
		return this.status;
	}
	
}

class TravelResponseSerializer implements IVersionedSerializer<TravelResponse>{

	@Override
	public void serialize(TravelResponse response, DataOutputPlus out, int version)
			throws IOException {
		out.writeInt(response.travel());
		out.writeInt(response.status());
	}

	@Override
	public TravelResponse deserialize(DataInput in, int version)
			throws IOException {
		return new TravelResponse(in.readInt(), in.readInt());
	}

	@Override
	public long serializedSize(TravelResponse t, int version) {
		return 2*4;
	}
	
}