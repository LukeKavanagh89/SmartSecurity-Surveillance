package lock;

import java.io.IOException;
import java.util.logging.Logger;

import alarm.PowerResponse;
import alarm.SoundRequest;
import alarm.SoundResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;



public class LockServer extends LockServiceImpl.java {
	private static final Logger logger = Logger.getLogger(LockServer.class.getName());
	
	public static void main(String[]args) throws IOException, InterruptedException{
		LockServer lockserver = new LockServer();
		
		int port = 50052;
		Server server = ServerBuilder.forPort(port)
		        .addService(lockserver)
		        .build()
		        .start();
		
		
		logger.info("Sever has started, its on" + port);
		server.awaitTermination();
		
		
	}
	
	public void changePower(PowerRequest request, StreamObserver<PowerResponse> responseObserver) {
		 System.out.println("receiving power sound request");
		 
		 Boolean lock = request.getState();
		 //added if statement 
		 
		 if(lock) {
			 System.out.println("The Security lock system is on");
		 }
		 
		 else {
			 System.out.println("The security lock system is currently off");
		 }
		 
		 
		 PowerResponse response = PowerResponse.newBuilder().getState(lock).build();
		 
		 responseObserver.onNext(response);
		 
	}
	
	public StreamObserver<ActivateRequest> setLocks(final StreamObserver<ActivateResponce> responseObserver){
		
		return new StreamObserver<ActivateRequest>() {
			
			int lock = 0;
			
			public void onNext(ActivateRequest value) {
				StringBuilder secure = new StringBuilder();
				
				secure.append(request.getText());
				System.out.println(secure);
				
				ActivateResponce work = ActivateResponce.newbuilder(.setLocks(secure.toString().build));
				
				responseObserver.onNext(reply);
			}
			
			public void onError(Throwable t) {
				System.out.println("Alarm is not working, Error");
			}
			public void onComplete() {
				responseObserver.onCompleted();
				
				
			}
		};
	}
	

}
