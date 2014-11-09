package org.apache.cassandra.db;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.cassandra.io.IVersionedSerializer;
import org.apache.cassandra.io.util.DataOutputPlus;

public class StartReadAndShuffleResponse {
	
	public static final IVersionedSerializer<StartReadAndShuffleResponse> serializer = new StartReadAndShuffleResponseSerializer();

	private final int id;
	private final int status; // 0 indicates Good, 1 indicates uploading the same travel command again; -1 indicates failure; 2 indicates return rows
	private final List<Row> rows;
	
	public StartReadAndShuffleResponse(){
		this.id = -1;
		this.status = -1;
		this.rows = null;
	}
	
	public StartReadAndShuffleResponse(int tid, int status){
		this.id = tid;
		this.status = status;
		this.rows = null;
	}
	
	public StartReadAndShuffleResponse(int tid, int status, List<Row> rows){
		this.id = tid;
		this.status = status;
		assert this.status == 2;
		assert rows != null;
		this.rows = rows;
	}
	
	public List<Row> rows(){
		return this.rows;
	}
	
	public int getId(){
		return this.id;
	}
	
	public int status(){
		return this.status;
	}
	
}

class StartReadAndShuffleResponseSerializer implements IVersionedSerializer<StartReadAndShuffleResponse>{

	@Override
	public void serialize(StartReadAndShuffleResponse response, DataOutputPlus out, int version)
			throws IOException {
		out.writeInt(response.getId());
		out.writeInt(response.status());
		if (response.status() == 2){
			int rowLen = response.rows().size();
			out.writeInt(rowLen);
			for (int i = 0; i < rowLen; i++){
				Row.serializer.serialize(response.rows().get(i), out, version);
			}
		}
	}

	@Override
	public StartReadAndShuffleResponse deserialize(DataInput in, int version)
			throws IOException {
		int id = in.readInt();
		int status = in.readInt();
		
		if (status != 2)
			return new StartReadAndShuffleResponse(id, status);
		
		else{
			int len = in.readInt();
			List<Row> rows = new ArrayList<Row>();
			for (int i = 0; i < len; i++){
				Row row = Row.serializer.deserialize(in, version, ColumnSerializer.Flag.FROM_REMOTE);
				rows.add(row);
			}
            return new StartReadAndShuffleResponse(id, status, rows);
		}
	}

	@Override
	public long serializedSize(StartReadAndShuffleResponse t, int version) {
		int size = 2 * 4;
		if (t.status() == 2){
			size += 4; //for the len
			for (int i = 0; i < t.rows().size(); i++){
				size += Row.serializer.serializedSize(t.rows().get(i), version);
			}
		}
		return size;
	}
	
}
