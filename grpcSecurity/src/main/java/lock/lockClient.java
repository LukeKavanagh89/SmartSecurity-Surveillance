package lock;

import java.util.Random;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class lockClient {
	
	private static LockServiceGrpc.LockServiceBlockingStub blockingStub;
	private static LockServiceGrpc.LockServiceStub asyncStub;

	private static void main(String[] args) throws Exception {
		ManagedChannel program = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		
		blockingStub = LockServiceGrpc.newBlockingStub(program);
		asyncStub = LockServiceGrpc.newStub(program);

		switchPower();
		changeLocks();
		
		
	}
	
	public static void switchPower() {
		
		PowerRequest request = PowerRequest.newBuilder().setSwitch(false).build();
		PowerResponce responce = blockingStub.switchPower(request);
		
		//Lock Power for If Statement
		if(responce.getSwitch()) {
			System.out.println("Locks are on!");
		}
		else {
			System.out.println("Locks are off!");
		}
		
	}
	
	public static void changeLocks() {
		StreamObserver<PowerResponce> responseObserver = new StreamObserver<PowerResponce>() {
			
			@Override
			public void onNext(PowerResponce value) {
				
				//Print out the response
				System.out.println("Locks have all been set" + value.getPower());
			}
			
			@Override
			public void onError(Throwable t) {

			}

			@Override
			public void onCompleted() {

			}
		};
		
		StreamObserver<ActivateRequest> requestObserver = asyncStub.changeLock(responseObserver);
		try {
			
			// Send out a request
			requestObserver.onNext(ActivateRequest.newBuilder().setLock(1).build());
			System.out.println("Lock");
			
		}catch (RuntimeException e) {
			requestObserver.onError(e);
			throw e;
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		requestObserver.onCompleted();
		
			
		}
		
	}

