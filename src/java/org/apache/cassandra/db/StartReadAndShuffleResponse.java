package org.apache.cassandra.db;

import java.io.DataInput;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.cassandra.io.IVersionedSerializer;
import org.apache.cassandra.io.util.DataOutputPlus;

public class StartReadAndShuffleResponse {
	
	public static final IVersionedSerializer<StartReadAndShuffleResponse> serializer = new StartReadAndShuffleResponseSerializer();

	private final int id;
    // 0 indicates Good, -1 indicates no element; 1 indicates return address; 2 indicates return rows
	private final int status;
	private final List<Row> rows;
    private final Set<InetAddress> adds;

	public StartReadAndShuffleResponse(){
		this.id = -1;
		this.status = -1;
		this.rows = null;
        this.adds = null;
	}
	
	public StartReadAndShuffleResponse(int tid, int status){
		this.id = tid;
		this.status = status;
		this.rows = null;
        this.adds = null;
	}
	
	public StartReadAndShuffleResponse(int tid, int status, List<Row> rows){
		this.id = tid;
		this.status = status;
		assert this.status == 2;
		assert rows != null;
		this.rows = rows;
        this.adds = null;
	}

    public StartReadAndShuffleResponse(int tid, int status, Set<InetAddress> adds){
        this.id = tid;
        this.status = status;
        assert this.status == 1;
        this.rows = null;
        this.adds = adds;
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

    public Set<InetAddress> adds() { return this.adds; }
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
		} else if (response.status() == 1){
            int addsLen = response.adds().size();
            out.writeInt(addsLen);
            for (int i = 0; i < addsLen; i++){
                List<InetAddress> guessedAllServers = new ArrayList<InetAddress>(response.adds());
                String ipStr = guessedAllServers.get(i).getHostAddress();
                out.writeInt(ipStr.length());
                out.writeBytes(ipStr);
            }
        }
	}

	@Override
	public StartReadAndShuffleResponse deserialize(DataInput in, int version)
			throws IOException {
		int id = in.readInt();
		int status = in.readInt();
		
		if (status == 2) {
			int len = in.readInt();
			List<Row> rows = new ArrayList<Row>();
			for (int i = 0; i < len; i++){
				Row row = Row.serializer.deserialize(in, version, ColumnSerializer.Flag.FROM_REMOTE);
				rows.add(row);
			}
            return new StartReadAndShuffleResponse(id, status, rows);
		} else if (status == 1){
            int len = in.readInt();
            Set<InetAddress> adds = new HashSet<>();
            for (int i = 0; i < len; i++){
                int size = in.readInt();
                byte bytes[] = new byte[size];
                in.readFully(bytes, 0, size);
                adds.add(InetAddress.getByAddress(bytes));
            }
            return new StartReadAndShuffleResponse(id, status, adds);
        } else {
            return new StartReadAndShuffleResponse(id, status);
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
		} else if (t.status() == 1){
            size += 4;
            for (int i = 0; i < t.adds().size(); i++){
                List<InetAddress> guessedAllServers = new ArrayList<InetAddress>(t.adds());
                String ipStr = guessedAllServers.get(i).getHostAddress();
                size += 4; //out.writeInt(ipStr.length());
                size += ipStr.length(); //out.writeBytes(ipStr);
            }
        }
		return size;
	}
	
}
