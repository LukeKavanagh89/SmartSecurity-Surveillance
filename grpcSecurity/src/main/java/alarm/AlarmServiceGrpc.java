package alarm;

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
    comments = "Source: alarm.proto")
public final class AlarmServiceGrpc {

  private AlarmServiceGrpc() {}

  public static final String SERVICE_NAME = "alarm.AlarmService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<alarm.PowerRequest,
      alarm.PowerResponse> getSwitchAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchAlarm",
      requestType = alarm.PowerRequest.class,
      responseType = alarm.PowerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alarm.PowerRequest,
      alarm.PowerResponse> getSwitchAlarmMethod() {
    io.grpc.MethodDescriptor<alarm.PowerRequest, alarm.PowerResponse> getSwitchAlarmMethod;
    if ((getSwitchAlarmMethod = AlarmServiceGrpc.getSwitchAlarmMethod) == null) {
      synchronized (AlarmServiceGrpc.class) {
        if ((getSwitchAlarmMethod = AlarmServiceGrpc.getSwitchAlarmMethod) == null) {
          AlarmServiceGrpc.getSwitchAlarmMethod = getSwitchAlarmMethod = 
              io.grpc.MethodDescriptor.<alarm.PowerRequest, alarm.PowerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alarm.AlarmService", "switchAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alarm.PowerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alarm.PowerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AlarmServiceMethodDescriptorSupplier("switchAlarm"))
                  .build();
          }
        }
     }
     return getSwitchAlarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alarm.SoundRequest,
      alarm.SoundRequest> getSoundAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "soundAlarm",
      requestType = alarm.SoundRequest.class,
      responseType = alarm.SoundRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<alarm.SoundRequest,
      alarm.SoundRequest> getSoundAlarmMethod() {
    io.grpc.MethodDescriptor<alarm.SoundRequest, alarm.SoundRequest> getSoundAlarmMethod;
    if ((getSoundAlarmMethod = AlarmServiceGrpc.getSoundAlarmMethod) == null) {
      synchronized (AlarmServiceGrpc.class) {
        if ((getSoundAlarmMethod = AlarmServiceGrpc.getSoundAlarmMethod) == null) {
          AlarmServiceGrpc.getSoundAlarmMethod = getSoundAlarmMethod = 
              io.grpc.MethodDescriptor.<alarm.SoundRequest, alarm.SoundRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "alarm.AlarmService", "soundAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alarm.SoundRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alarm.SoundRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new AlarmServiceMethodDescriptorSupplier("soundAlarm"))
                  .build();
          }
        }
     }
     return getSoundAlarmMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlarmServiceStub newStub(io.grpc.Channel channel) {
    return new AlarmServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlarmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AlarmServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlarmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AlarmServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AlarmServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchAlarm(alarm.PowerRequest request,
        io.grpc.stub.StreamObserver<alarm.PowerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchAlarmMethod(), responseObserver);
    }

    /**
     */
    public void soundAlarm(alarm.SoundRequest request,
        io.grpc.stub.StreamObserver<alarm.SoundRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getSoundAlarmMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchAlarmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alarm.PowerRequest,
                alarm.PowerResponse>(
                  this, METHODID_SWITCH_ALARM)))
          .addMethod(
            getSoundAlarmMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                alarm.SoundRequest,
                alarm.SoundRequest>(
                  this, METHODID_SOUND_ALARM)))
          .build();
    }
  }

  /**
   */
  public static final class AlarmServiceStub extends io.grpc.stub.AbstractStub<AlarmServiceStub> {
    private AlarmServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlarmServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlarmServiceStub(channel, callOptions);
    }

    /**
     */
    public void switchAlarm(alarm.PowerRequest request,
        io.grpc.stub.StreamObserver<alarm.PowerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchAlarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void soundAlarm(alarm.SoundRequest request,
        io.grpc.stub.StreamObserver<alarm.SoundRequest> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSoundAlarmMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AlarmServiceBlockingStub extends io.grpc.stub.AbstractStub<AlarmServiceBlockingStub> {
    private AlarmServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlarmServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlarmServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public alarm.PowerResponse switchAlarm(alarm.PowerRequest request) {
      return blockingUnaryCall(
          getChannel(), getSwitchAlarmMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<alarm.SoundRequest> soundAlarm(
        alarm.SoundRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSoundAlarmMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AlarmServiceFutureStub extends io.grpc.stub.AbstractStub<AlarmServiceFutureStub> {
    private AlarmServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlarmServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlarmServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<alarm.PowerResponse> switchAlarm(
        alarm.PowerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchAlarmMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_ALARM = 0;
  private static final int METHODID_SOUND_ALARM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlarmServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlarmServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_ALARM:
          serviceImpl.switchAlarm((alarm.PowerRequest) request,
              (io.grpc.stub.StreamObserver<alarm.PowerResponse>) responseObserver);
          break;
        case METHODID_SOUND_ALARM:
          serviceImpl.soundAlarm((alarm.SoundRequest) request,
              (io.grpc.stub.StreamObserver<alarm.SoundRequest>) responseObserver);
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

  private static abstract class AlarmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlarmServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return alarm.AlarmServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlarmService");
    }
  }

  private static final class AlarmServiceFileDescriptorSupplier
      extends AlarmServiceBaseDescriptorSupplier {
    AlarmServiceFileDescriptorSupplier() {}
  }

  private static final class AlarmServiceMethodDescriptorSupplier
      extends AlarmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlarmServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AlarmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlarmServiceFileDescriptorSupplier())
              .addMethod(getSwitchAlarmMethod())
              .addMethod(getSoundAlarmMethod())
              .build();
        }
      }
    }
    return result;
  }
}
