package server;

import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import utils.Output;
import utils.Tuple;

public abstract class AbstractServer {

	private static final Logger logger=LoggerFactory.getLogger(AbstractServer.class);
	
	
	public abstract class ResponseHandler implements Callable<Tuple<Output,String>>{
		
		private final String request;
		
		
		public ResponseHandler(String request) {
			super();
			this.request = request;
		}


		protected abstract Tuple<Output, String> response(String request);


		@Override
		public Tuple<Output, String> call() throws Exception {
			// TODO Auto-generated method stub
			return response(request);
		}
		
		
	}
	
	private class Client extends Thread{
		
		
	}
	
	public abstract void stratServer();
	
	
}
