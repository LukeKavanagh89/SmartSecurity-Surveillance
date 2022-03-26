package alarm;

import java.util.Random;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class AlarmCLient {
	
	private static AlarmServiceGrpc.AlarmServiceBlockingStub blockingStub;
	private static AlarmServiceGrpc.AlarmServiceStub asyncStub;
	
	public static void main(String[] args) throws Exception{
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
		
		blockingStub = AlarmServiceGrpc.newBlockingStub(channel);
		asyncStub = AlarmServiceGrpc.newStub(channel);
		
		switchPower();
		setSystem();
		
		
	}
	
	public static void switchPower() {
		
		PowerRequest request = PowerRequest.newBuilder().setState(true).build();
		PowerResponse response = blockingStub.switchPower(request);
		
		if(response.getState()) {
			System.out.println("Alarm system is activated");
		}
		else 
		{
			System.out.println("Alarm System has been deactivated");
		}
	}
	
	public static void setSystem() {
		
		StreamObserver<SoundResponse> responseObserver = new StreamObserver<SoundResponse>() {
			
			@Override
			public void onNext(SoundResponse value) {
				System.out.println("Alarm system sounds is ready " + value.getText());
			}
			@Override
			public void onError(Throwable t) {

			}
			@Override
			public void onCompleted() {

			}
			
			
		};
		StreamObserver<SoundRequest> requestObserver = asyncStub.sendSound(responseObserver);
		try {
			requestObserver.onNext(SoundRequest.newBuilder().setText("Alarm 1 is in place").build());
			requestObserver.onNext(SoundRequest.newBuilder().setText("Alarm 2 is in place").build());
			requestObserver.onNext(SoundRequest.newBuilder().setText("Alarm 3 is in place").build());
			requestObserver.onNext(SoundRequest.newBuilder().setText("Alarm 4 is in place").build());
			requestObserver.onNext(SoundRequest.newBuilder().setText("Alarm 5 is in place").build());
			
			
		} catch (RuntimeException e) {
			
            requestObserver.onError(e);
            throw e;
            
            } catch (InterruptedException e) {

                e.printStackTrace();
        }

		requestObserver.onCompleted();
	}
}