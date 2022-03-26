package alarm;

import java.io.IOException;

import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;
import io.grpc.ServerBuilder;
import alarm.AlarmServiceGrpc.AlarmServiceImplBase;



public class AlarmServer extends AlarmServiceImpl.java {
	
	private static final Logger logger = Logger.getLogger(AlarmServer.class.getName());
	
	public static void main(String[]args) throws IOException, InterruptedException{
		AlarmServer alarmserver = new AlarmServer();
		
		int port = 50052;
		Server server = ServerBuilder.forPort(port)
		        .addService(alarmserver)
		        .build()
		        .start();
		
		
		logger.info("Sever has started, its on" + port);
		server.awaitTermination();
		
		
	}
	
	public void changePower(PowerRequest request, StreamObserver<PowerResponse> responseObserver) {
		 System.out.println("receiving power sound request");
		 
		 Boolean sound = request.getSound();
		 System.out.println(sound);
		 
		 responseObserver.onNext(PowerResponse.newBuilder().setSound(true).build());
		 responseObserver.onCompleted();
		 
	}
	
	
	
	public void soundAlarm(SoundRequest request,  StreamObserver<SoundResponse> responseObserver) {
		System.out.println("receiving Alarm request");
		
		int alarm = request.getSound();
		System.out.println(alarm);
		responseObserver.onNext(SoundResponse.newBuilder().setSound(5).build());
		responseObserver.onNext();
	}
	
	public void onError(Throwable t) {
        System.out.println("Issue, There is a problem with the alarm system");
      }
	public void onCompleted() {
        responseObserver.onCompleted();
      }
    };
    }

}
