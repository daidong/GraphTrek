package org.apache.cassandra.service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.cassandra.db.TravelResponse;
import org.apache.cassandra.net.IAsyncCallback;
import org.apache.cassandra.net.MessageIn;
import org.apache.cassandra.utils.concurrent.SimpleCondition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TravelCallback<TMessage, TResolved> implements IAsyncCallback<TMessage>{

	protected static final Logger logger = LoggerFactory.getLogger(TravelCallback.class);
	private final AtomicInteger accepts = new AtomicInteger(0);
	private final int waitFor;
	private final SimpleCondition condition = new SimpleCondition();
	private final long timeout = 1;
			
	public TravelCallback(int waits){
		this.waitFor = waits;
	}
	
	@Override
	public void response(MessageIn<TMessage> msg) {
		logger.info("@daidong debug: response from TravelCallback");
		
		TravelResponse response = (TravelResponse) msg.payload;
		if (response.status() == 0 || response.status() == 1)
			accepts.incrementAndGet();
		if (accepts.get() >= waitFor){
			condition.signalAll();
		}
	}

	public boolean await(long time){
		try {
			return condition.await(time, TimeUnit.SECONDS);
		} catch (InterruptedException ex) {
			throw new AssertionError(ex);
		}
	}
	
	
	public int get(){
		if (!await(this.timeout)){
			throw new AssertionError("Time out exception");
		}
		return accepts.get();
	}
	
	@Override
	public boolean isLatencyForSnitch() {
		return true;
	}

}
