package zeromq;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zeromq.ZMQ;

import utils.ZeroMqInterface;

public class ZeroMqPublisher<E>  {
	private static final Logger logger=LoggerFactory.getLogger(ZeroMqPublisher.class);
    
	ZeroMqInterface<E> zeroMqInterface;
	
	
	public ZeroMqPublisher(ZeroMqInterface<E> zeroMqInterface) {
		super();
		this.zeroMqInterface = zeroMqInterface;
	}


	public ZeroMqPublisher() {
		super();
		
	}
	
	public void publish(long id, E element) {
		if(zeroMqInterface!=null) {
			zeroMqInterface.publish(id, element);
		}
	}


	
}
