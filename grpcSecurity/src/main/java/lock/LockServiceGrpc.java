package lock;

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
    comments = "Source: lock.proto")
public final class LockServiceGrpc {

  private LockServiceGrpc() {}

  public static final String SERVICE_NAME = "lock.LockService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lock.PowerRequest,
      lock.PowerResponce> getSwitchPowerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchPower",
      requestType = lock.PowerRequest.class,
      responseType = lock.PowerResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lock.PowerRequest,
      lock.PowerResponce> getSwitchPowerMethod() {
    io.grpc.MethodDescriptor<lock.PowerRequest, lock.PowerResponce> getSwitchPowerMethod;
    if ((getSwitchPowerMethod = LockServiceGrpc.getSwitchPowerMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getSwitchPowerMethod = LockServiceGrpc.getSwitchPowerMethod) == null) {
          LockServiceGrpc.getSwitchPowerMethod = getSwitchPowerMethod = 
              io.grpc.MethodDescriptor.<lock.PowerRequest, lock.PowerResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lock.LockService", "switchPower"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lock.PowerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lock.PowerResponce.getDefaultInstance()))
                  .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("switchPower"))
                  .build();
          }
        }
     }
     return getSwitchPowerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lock.ActivateRequest,
      lock.ActivateResponce> getActivateLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateLock",
      requestType = lock.ActivateRequest.class,
      responseType = lock.ActivateResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<lock.ActivateRequest,
      lock.ActivateResponce> getActivateLockMethod() {
    io.grpc.MethodDescriptor<lock.ActivateRequest, lock.ActivateResponce> getActivateLockMethod;
    if ((getActivateLockMethod = LockServiceGrpc.getActivateLockMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getActivateLockMethod = LockServiceGrpc.getActivateLockMethod) == null) {
          LockServiceGrpc.getActivateLockMethod = getActivateLockMethod = 
              io.grpc.MethodDescriptor.<lock.ActivateRequest, lock.ActivateResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "lock.LockService", "activateLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lock.ActivateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lock.ActivateResponce.getDefaultInstance()))
                  .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("activateLock"))
                  .build();
          }
        }
     }
     return getActivateLockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LockServiceStub newStub(io.grpc.Channel channel) {
    return new LockServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LockServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LockServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LockServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LockServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LockServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchPower(lock.PowerRequest request,
        io.grpc.stub.StreamObserver<lock.PowerResponce> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchPowerMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<lock.ActivateRequest> activateLock(
        io.grpc.stub.StreamObserver<lock.ActivateResponce> responseObserver) {
      return asyncUnimplementedStreamingCall(getActivateLockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchPowerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lock.PowerRequest,
                lock.PowerResponce>(
                  this, METHODID_SWITCH_POWER)))
          .addMethod(
            getActivateLockMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                lock.ActivateRequest,
                lock.ActivateResponce>(
                  this, METHODID_ACTIVATE_LOCK)))
          .build();
    }
  }

  /**
   */
  public static final class LockServiceStub extends io.grpc.stub.AbstractStub<LockServiceStub> {
    private LockServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LockServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LockServiceStub(channel, callOptions);
    }

    /**
     */
    public void switchPower(lock.PowerRequest request,
        io.grpc.stub.StreamObserver<lock.PowerResponce> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchPowerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<lock.ActivateRequest> activateLock(
        io.grpc.stub.StreamObserver<lock.ActivateResponce> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getActivateLockMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class LockServiceBlockingStub extends io.grpc.stub.AbstractStub<LockServiceBlockingStub> {
    private LockServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LockServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LockServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public lock.PowerResponce switchPower(lock.PowerRequest request) {
      return blockingUnaryCall(
          getChannel(), getSwitchPowerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LockServiceFutureStub extends io.grpc.stub.AbstractStub<LockServiceFutureStub> {
    private LockServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LockServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LockServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lock.PowerResponce> switchPower(
        lock.PowerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchPowerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_POWER = 0;
  private static final int METHODID_ACTIVATE_LOCK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LockServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LockServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_POWER:
          serviceImpl.switchPower((lock.PowerRequest) request,
              (io.grpc.stub.StreamObserver<lock.PowerResponce>) responseObserver);
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
        case METHODID_ACTIVATE_LOCK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.activateLock(
              (io.grpc.stub.StreamObserver<lock.ActivateResponce>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LockServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lock.LockServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LockService");
    }
  }

  private static final class LockServiceFileDescriptorSupplier
      extends LockServiceBaseDescriptorSupplier {
    LockServiceFileDescriptorSupplier() {}
  }

  private static final class LockServiceMethodDescriptorSupplier
      extends LockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LockServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LockServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LockServiceFileDescriptorSupplier())
              .addMethod(getSwitchPowerMethod())
              .addMethod(getActivateLockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
