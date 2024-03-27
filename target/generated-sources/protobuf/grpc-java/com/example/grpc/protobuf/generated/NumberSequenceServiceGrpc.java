package com.example.grpc.protobuf.generated;

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
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: NumberSequence.proto")
public final class NumberSequenceServiceGrpc {

  private NumberSequenceServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.protobuf.generated.NumberSequenceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.protobuf.generated.NumberSequenceRequest,
      com.example.grpc.protobuf.generated.NumberSequenceReply> getGetNumbersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNumbers",
      requestType = com.example.grpc.protobuf.generated.NumberSequenceRequest.class,
      responseType = com.example.grpc.protobuf.generated.NumberSequenceReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.protobuf.generated.NumberSequenceRequest,
      com.example.grpc.protobuf.generated.NumberSequenceReply> getGetNumbersMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.protobuf.generated.NumberSequenceRequest, com.example.grpc.protobuf.generated.NumberSequenceReply> getGetNumbersMethod;
    if ((getGetNumbersMethod = NumberSequenceServiceGrpc.getGetNumbersMethod) == null) {
      synchronized (NumberSequenceServiceGrpc.class) {
        if ((getGetNumbersMethod = NumberSequenceServiceGrpc.getGetNumbersMethod) == null) {
          NumberSequenceServiceGrpc.getGetNumbersMethod = getGetNumbersMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.protobuf.generated.NumberSequenceRequest, com.example.grpc.protobuf.generated.NumberSequenceReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getNumbers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.protobuf.generated.NumberSequenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.protobuf.generated.NumberSequenceReply.getDefaultInstance()))
              .setSchemaDescriptor(new NumberSequenceServiceMethodDescriptorSupplier("getNumbers"))
              .build();
        }
      }
    }
    return getGetNumbersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NumberSequenceServiceStub newStub(io.grpc.Channel channel) {
    return new NumberSequenceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NumberSequenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NumberSequenceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NumberSequenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NumberSequenceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NumberSequenceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNumbers(com.example.grpc.protobuf.generated.NumberSequenceRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.protobuf.generated.NumberSequenceReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNumbersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNumbersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.grpc.protobuf.generated.NumberSequenceRequest,
                com.example.grpc.protobuf.generated.NumberSequenceReply>(
                  this, METHODID_GET_NUMBERS)))
          .build();
    }
  }

  /**
   */
  public static final class NumberSequenceServiceStub extends io.grpc.stub.AbstractStub<NumberSequenceServiceStub> {
    private NumberSequenceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumberSequenceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberSequenceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumberSequenceServiceStub(channel, callOptions);
    }

    /**
     */
    public void getNumbers(com.example.grpc.protobuf.generated.NumberSequenceRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.protobuf.generated.NumberSequenceReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetNumbersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NumberSequenceServiceBlockingStub extends io.grpc.stub.AbstractStub<NumberSequenceServiceBlockingStub> {
    private NumberSequenceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumberSequenceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberSequenceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumberSequenceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.example.grpc.protobuf.generated.NumberSequenceReply> getNumbers(
        com.example.grpc.protobuf.generated.NumberSequenceRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetNumbersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NumberSequenceServiceFutureStub extends io.grpc.stub.AbstractStub<NumberSequenceServiceFutureStub> {
    private NumberSequenceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumberSequenceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberSequenceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumberSequenceServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_NUMBERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NumberSequenceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NumberSequenceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NUMBERS:
          serviceImpl.getNumbers((com.example.grpc.protobuf.generated.NumberSequenceRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.protobuf.generated.NumberSequenceReply>) responseObserver);
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

  private static abstract class NumberSequenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NumberSequenceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.protobuf.generated.NumberSequenceStreamingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NumberSequenceService");
    }
  }

  private static final class NumberSequenceServiceFileDescriptorSupplier
      extends NumberSequenceServiceBaseDescriptorSupplier {
    NumberSequenceServiceFileDescriptorSupplier() {}
  }

  private static final class NumberSequenceServiceMethodDescriptorSupplier
      extends NumberSequenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NumberSequenceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NumberSequenceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NumberSequenceServiceFileDescriptorSupplier())
              .addMethod(getGetNumbersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
