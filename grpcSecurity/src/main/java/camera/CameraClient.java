package camera;


import java.util.Random;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class CameraClient{
	private static CameraServiceGrpc.CameraServiceBlockingStub blockingStub;
	private static CameraServiceGrpc.CameraServiceStub asyncStub;
	
	
	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
		
		blockingStub = CameraServiceGrpc.newBlockingStub(channel);
		asyncStub = CameraServiceGrpc.newStub(channel);

		switchPower();
		changeView();

	}
	
	public static void switchPower() {
		//Request
		PowerRequest request = PowerRequest.newBuilder().setSwitch(false).build();
		
		//Response
		PowerResponse response = blockingStub.switchPower(request);
		
		//Printing message from response
		if(response.getSwitch()) {
			System.out.println("Camera has been switched on");
		}
		else {
			System.out.println("Camera is currently off");
		}
		
	}
	
	public static void changeView() {
		StreamObserver<PowerResponse> responseObserver = new StreamObserver<PowerResponse>() {
			@Override
			public void onNext(PowerResponse value) {
				System.out.println("receiving camera view" + value.getStatement());
			}

			@Override
			public void onError(Throwable t) {

			}

			@Override
			public void onCompleted() {

			}

		};
		StreamObserver<PowerRequest> requestObserver = asyncStub.printStatement(responseObserver);
		try {
			requestObserver.onNext(PowerRequest.newBuilder().setStatement("Camera 1").build());
			requestObserver.onNext(PowerRequest.newBuilder().setStatement("Camera 2").build());
			requestObserver.onNext(PowerRequest.newBuilder().setStatement("Camera 3").build());
			
		}catch (RuntimeException e) {
            requestObserver.onError(e);
            throw e;
            } catch (InterruptedException e) {

                e.printStackTrace();
        }
			requestObserver.onCompleted();
		

			
		}
		
	}
	