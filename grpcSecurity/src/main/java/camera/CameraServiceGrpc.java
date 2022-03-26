package camera;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: camera.proto")
public final class CameraServiceGrpc {

  private CameraServiceGrpc() {}

  public static final String SERVICE_NAME = "camera.CameraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<camera.PowerRequest,
      camera.PowerResponse> getCameraRecordingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cameraRecording",
      requestType = camera.PowerRequest.class,
      responseType = camera.PowerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<camera.PowerRequest,
      camera.PowerResponse> getCameraRecordingMethod() {
    io.grpc.MethodDescriptor<camera.PowerRequest, camera.PowerResponse> getCameraRecordingMethod;
    if ((getCameraRecordingMethod = CameraServiceGrpc.getCameraRecordingMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getCameraRecordingMethod = CameraServiceGrpc.getCameraRecordingMethod) == null) {
          CameraServiceGrpc.getCameraRecordingMethod = getCameraRecordingMethod = 
              io.grpc.MethodDescriptor.<camera.PowerRequest, camera.PowerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "camera.CameraService", "cameraRecording"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camera.PowerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camera.PowerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraServiceMethodDescriptorSupplier("cameraRecording"))
                  .build();
          }
        }
     }
     return getCameraRecordingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<camera.CameraRequest,
      camera.CameraResponse> getCameraChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cameraChange",
      requestType = camera.CameraRequest.class,
      responseType = camera.CameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<camera.CameraRequest,
      camera.CameraResponse> getCameraChangeMethod() {
    io.grpc.MethodDescriptor<camera.CameraRequest, camera.CameraResponse> getCameraChangeMethod;
    if ((getCameraChangeMethod = CameraServiceGrpc.getCameraChangeMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getCameraChangeMethod = CameraServiceGrpc.getCameraChangeMethod) == null) {
          CameraServiceGrpc.getCameraChangeMethod = getCameraChangeMethod = 
              io.grpc.MethodDescriptor.<camera.CameraRequest, camera.CameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "camera.CameraService", "cameraChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camera.CameraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camera.CameraResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraServiceMethodDescriptorSupplier("cameraChange"))
                  .build();
          }
        }
     }
     return getCameraChangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CameraServiceStub newStub(io.grpc.Channel channel) {
    return new CameraServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CameraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CameraServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CameraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CameraServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CameraServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void cameraRecording(camera.PowerRequest request,
        io.grpc.stub.StreamObserver<camera.PowerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCameraRecordingMethod(), responseObserver);
    }

    /**
     */
    public void cameraChange(camera.CameraRequest request,
        io.grpc.stub.StreamObserver<camera.CameraResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCameraChangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCameraRecordingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                camera.PowerRequest,
                camera.PowerResponse>(
                  this, METHODID_CAMERA_RECORDING)))
          .addMethod(
            getCameraChangeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                camera.CameraRequest,
                camera.CameraResponse>(
                  this, METHODID_CAMERA_CHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class CameraServiceStub extends io.grpc.stub.AbstractStub<CameraServiceStub> {
    private CameraServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraServiceStub(channel, callOptions);
    }

    /**
     */
    public void cameraRecording(camera.PowerRequest request,
        io.grpc.stub.StreamObserver<camera.PowerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCameraRecordingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cameraChange(camera.CameraRequest request,
        io.grpc.stub.StreamObserver<camera.CameraResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCameraChangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CameraServiceBlockingStub extends io.grpc.stub.AbstractStub<CameraServiceBlockingStub> {
    private CameraServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public camera.PowerResponse cameraRecording(camera.PowerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCameraRecordingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<camera.CameraResponse> cameraChange(
        camera.CameraRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getCameraChangeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CameraServiceFutureStub extends io.grpc.stub.AbstractStub<CameraServiceFutureStub> {
    private CameraServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<camera.PowerResponse> cameraRecording(
        camera.PowerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCameraRecordingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CAMERA_RECORDING = 0;
  private static final int METHODID_CAMERA_CHANGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CameraServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CameraServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CAMERA_RECORDING:
          serviceImpl.cameraRecording((camera.PowerRequest) request,
              (io.grpc.stub.StreamObserver<camera.PowerResponse>) responseObserver);
          break;
        case METHODID_CAMERA_CHANGE:
          serviceImpl.cameraChange((camera.CameraRequest) request,
              (io.grpc.stub.StreamObserver<camera.CameraResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CameraServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return camera.CameraServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CameraService");
    }
  }

  private static final class CameraServiceFileDescriptorSupplier
      extends CameraServiceBaseDescriptorSupplier {
    CameraServiceFileDescriptorSupplier() {}
  }

  private static final class CameraServiceMethodDescriptorSupplier
      extends CameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CameraServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CameraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CameraServiceFileDescriptorSupplier())
              .addMethod(getCameraRecordingMethod())
              .addMethod(getCameraChangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
