package org.test.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: helloworld.proto")
public final class TestGrpc {

  private TestGrpc() {}

  public static final String SERVICE_NAME = "test.Test";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.test.lib.HelloRequest,
      org.test.lib.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = org.test.lib.HelloRequest.class,
      responseType = org.test.lib.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.test.lib.HelloRequest,
      org.test.lib.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<org.test.lib.HelloRequest, org.test.lib.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = TestGrpc.getSayHelloMethod) == null) {
      synchronized (TestGrpc.class) {
        if ((getSayHelloMethod = TestGrpc.getSayHelloMethod) == null) {
          TestGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<org.test.lib.HelloRequest, org.test.lib.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.test.lib.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.test.lib.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new TestMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.test.lib.RepeatedRequest,
      org.test.lib.RepeatedReply> getRepeatedTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RepeatedTest",
      requestType = org.test.lib.RepeatedRequest.class,
      responseType = org.test.lib.RepeatedReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.test.lib.RepeatedRequest,
      org.test.lib.RepeatedReply> getRepeatedTestMethod() {
    io.grpc.MethodDescriptor<org.test.lib.RepeatedRequest, org.test.lib.RepeatedReply> getRepeatedTestMethod;
    if ((getRepeatedTestMethod = TestGrpc.getRepeatedTestMethod) == null) {
      synchronized (TestGrpc.class) {
        if ((getRepeatedTestMethod = TestGrpc.getRepeatedTestMethod) == null) {
          TestGrpc.getRepeatedTestMethod = getRepeatedTestMethod =
              io.grpc.MethodDescriptor.<org.test.lib.RepeatedRequest, org.test.lib.RepeatedReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RepeatedTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.test.lib.RepeatedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.test.lib.RepeatedReply.getDefaultInstance()))
              .setSchemaDescriptor(new TestMethodDescriptorSupplier("RepeatedTest"))
              .build();
        }
      }
    }
    return getRepeatedTestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.test.lib.ServerStreamRequest,
      org.test.lib.ServerStreamReply> getServerStreamTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerStreamTest",
      requestType = org.test.lib.ServerStreamRequest.class,
      responseType = org.test.lib.ServerStreamReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.test.lib.ServerStreamRequest,
      org.test.lib.ServerStreamReply> getServerStreamTestMethod() {
    io.grpc.MethodDescriptor<org.test.lib.ServerStreamRequest, org.test.lib.ServerStreamReply> getServerStreamTestMethod;
    if ((getServerStreamTestMethod = TestGrpc.getServerStreamTestMethod) == null) {
      synchronized (TestGrpc.class) {
        if ((getServerStreamTestMethod = TestGrpc.getServerStreamTestMethod) == null) {
          TestGrpc.getServerStreamTestMethod = getServerStreamTestMethod =
              io.grpc.MethodDescriptor.<org.test.lib.ServerStreamRequest, org.test.lib.ServerStreamReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerStreamTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.test.lib.ServerStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.test.lib.ServerStreamReply.getDefaultInstance()))
              .setSchemaDescriptor(new TestMethodDescriptorSupplier("ServerStreamTest"))
              .build();
        }
      }
    }
    return getServerStreamTestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestStub>() {
        @java.lang.Override
        public TestStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestStub(channel, callOptions);
        }
      };
    return TestStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestBlockingStub>() {
        @java.lang.Override
        public TestBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestBlockingStub(channel, callOptions);
        }
      };
    return TestBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestFutureStub>() {
        @java.lang.Override
        public TestFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestFutureStub(channel, callOptions);
        }
      };
    return TestFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TestImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(org.test.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<org.test.lib.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void repeatedTest(org.test.lib.RepeatedRequest request,
        io.grpc.stub.StreamObserver<org.test.lib.RepeatedReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRepeatedTestMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.test.lib.ServerStreamRequest> serverStreamTest(
        io.grpc.stub.StreamObserver<org.test.lib.ServerStreamReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getServerStreamTestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.test.lib.HelloRequest,
                org.test.lib.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getRepeatedTestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.test.lib.RepeatedRequest,
                org.test.lib.RepeatedReply>(
                  this, METHODID_REPEATED_TEST)))
          .addMethod(
            getServerStreamTestMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.test.lib.ServerStreamRequest,
                org.test.lib.ServerStreamReply>(
                  this, METHODID_SERVER_STREAM_TEST)))
          .build();
    }
  }

  /**
   */
  public static final class TestStub extends io.grpc.stub.AbstractAsyncStub<TestStub> {
    private TestStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(org.test.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<org.test.lib.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void repeatedTest(org.test.lib.RepeatedRequest request,
        io.grpc.stub.StreamObserver<org.test.lib.RepeatedReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRepeatedTestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.test.lib.ServerStreamRequest> serverStreamTest(
        io.grpc.stub.StreamObserver<org.test.lib.ServerStreamReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getServerStreamTestMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TestBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestBlockingStub> {
    private TestBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.test.lib.HelloReply sayHello(org.test.lib.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.test.lib.RepeatedReply repeatedTest(org.test.lib.RepeatedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRepeatedTestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestFutureStub extends io.grpc.stub.AbstractFutureStub<TestFutureStub> {
    private TestFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.test.lib.HelloReply> sayHello(
        org.test.lib.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.test.lib.RepeatedReply> repeatedTest(
        org.test.lib.RepeatedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRepeatedTestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_REPEATED_TEST = 1;
  private static final int METHODID_SERVER_STREAM_TEST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((org.test.lib.HelloRequest) request,
              (io.grpc.stub.StreamObserver<org.test.lib.HelloReply>) responseObserver);
          break;
        case METHODID_REPEATED_TEST:
          serviceImpl.repeatedTest((org.test.lib.RepeatedRequest) request,
              (io.grpc.stub.StreamObserver<org.test.lib.RepeatedReply>) responseObserver);
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
        case METHODID_SERVER_STREAM_TEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.serverStreamTest(
              (io.grpc.stub.StreamObserver<org.test.lib.ServerStreamReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.test.lib.TestProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Test");
    }
  }

  private static final class TestFileDescriptorSupplier
      extends TestBaseDescriptorSupplier {
    TestFileDescriptorSupplier() {}
  }

  private static final class TestMethodDescriptorSupplier
      extends TestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestMethodDescriptorSupplier(String methodName) {
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
      synchronized (TestGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getRepeatedTestMethod())
              .addMethod(getServerStreamTestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
