package camera;


import java.io.IOException;
import java.util.logging.Logger;

import camera.PowerResponse;
import camera.PowerRequest;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import camera.CameraServiceGrpc.CameraServiceImplBase;

public class CameraServer extends CameraServiceImplBase{
	
	private static final Logger logger = Logger.getLogger(CameraServer.class.getName());
	
	public static void main(String[] args) throws IOException, InterruptedException {
		CameraServer lensesserver = new CameraServer();
		
		int port = 50052;
		
		Server server = ServerBuilder.forPort(port)
				.build()
				.addService(lensesserver)
				.start();
		
		logger.info("The Server has started, Located on port" + port);
		
		server.awaitTermination();
		
	}
	
	public void startCamera(PowerRequest request, StreamObserver<PowerResponse> responseObserver) {
		System.out.println("Camera power is being retrieved");
		
		Boolean camera = request.getState();
		
		if(camera) {
			System.out.println("Camera power has started");
		}
		else {
			System.out.println("Camera power is off");
		}
		
		 PowerResponse response = PowerResponse.newBuilder().getState(camera).build();
		 responseObserver.onNext(response); 
		 responseObserver.onCompleted();
	}
	
	public StreamObserver<CameraRequest> setCamera(final StreamObserver<CameraResponse> responseObserver){
		return new StreamObserver<CameraRequest>() {
			int camera = 0;
			
			public void onNext(CameraRequest value) {
				
				camera = value.getCamera();
				System.out.println("Request to turn on camera" + camera);
			}
			
			public void onError(Throwable t) {
				t.printStackTrace();
			}
			
			public void onComplete() {
				CameraResponse response = CameraResponse.newBuilder().setCamera(camera).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
							
			}
			
		};
	}

}
