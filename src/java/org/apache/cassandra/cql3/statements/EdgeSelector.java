package org.apache.cassandra.cql3.statements;

import java.util.ArrayList;
import java.util.List;

import org.apache.cassandra.cql3.CFName;
import org.apache.cassandra.cql3.Relation;

public class EdgeSelector {

	private CFName name;
	private List<Relation> edgeWhere;
	private List<Relation> endWhere;
	
	public EdgeSelector(){
		this.edgeWhere = new ArrayList<Relation>();
		this.endWhere = new ArrayList<Relation>();
	}
	public void setEdgeWhere(List<Relation> edgeWhere){
		this.edgeWhere = edgeWhere;
	}
	
	public void setToCF(CFName name){
		this.name = name;
	}
	
	public void setEndWhere(List<Relation> endWhere){
		this.endWhere = endWhere;
	}

	public CFName getName(){
		return this.name;
	}
	
	public List<Relation> getEdgeWhere(){
		return this.edgeWhere;
	}
	
	public List<Relation> getEndWhere(){
		return this.endWhere;
	}
	
	@Override
	public String toString() {
		String rtn = "EdgeSelector [name=" + name.toString() + ", edgeWhere= [";
		for (Relation r : edgeWhere){
			rtn += r.toString();
		}
		rtn += " ], endWhere= [ ";
		for (Relation r : endWhere){
			rtn += r.toString();
		}
		rtn += " ]";
		return rtn;
	}
	
}
