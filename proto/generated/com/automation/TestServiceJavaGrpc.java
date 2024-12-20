package com.automation;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: java_generate.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestServiceJavaGrpc {

  private TestServiceJavaGrpc() {}

  public static final String SERVICE_NAME = "automation.TestServiceJava";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.automation.JavaGenerate.TestRequestJava,
      com.automation.JavaGenerate.TestResponseJava> getTestMethodJavaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestMethodJava",
      requestType = com.automation.JavaGenerate.TestRequestJava.class,
      responseType = com.automation.JavaGenerate.TestResponseJava.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.automation.JavaGenerate.TestRequestJava,
      com.automation.JavaGenerate.TestResponseJava> getTestMethodJavaMethod() {
    io.grpc.MethodDescriptor<com.automation.JavaGenerate.TestRequestJava, com.automation.JavaGenerate.TestResponseJava> getTestMethodJavaMethod;
    if ((getTestMethodJavaMethod = TestServiceJavaGrpc.getTestMethodJavaMethod) == null) {
      synchronized (TestServiceJavaGrpc.class) {
        if ((getTestMethodJavaMethod = TestServiceJavaGrpc.getTestMethodJavaMethod) == null) {
          TestServiceJavaGrpc.getTestMethodJavaMethod = getTestMethodJavaMethod =
              io.grpc.MethodDescriptor.<com.automation.JavaGenerate.TestRequestJava, com.automation.JavaGenerate.TestResponseJava>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestMethodJava"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.automation.JavaGenerate.TestRequestJava.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.automation.JavaGenerate.TestResponseJava.getDefaultInstance()))
              .setSchemaDescriptor(new TestServiceJavaMethodDescriptorSupplier("TestMethodJava"))
              .build();
        }
      }
    }
    return getTestMethodJavaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestServiceJavaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceJavaStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceJavaStub>() {
        @java.lang.Override
        public TestServiceJavaStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceJavaStub(channel, callOptions);
        }
      };
    return TestServiceJavaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestServiceJavaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceJavaBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceJavaBlockingStub>() {
        @java.lang.Override
        public TestServiceJavaBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceJavaBlockingStub(channel, callOptions);
        }
      };
    return TestServiceJavaBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestServiceJavaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceJavaFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceJavaFutureStub>() {
        @java.lang.Override
        public TestServiceJavaFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceJavaFutureStub(channel, callOptions);
        }
      };
    return TestServiceJavaFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TestServiceJavaImplBase implements io.grpc.BindableService {

    /**
     */
    public void testMethodJava(com.automation.JavaGenerate.TestRequestJava request,
        io.grpc.stub.StreamObserver<com.automation.JavaGenerate.TestResponseJava> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestMethodJavaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestMethodJavaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.automation.JavaGenerate.TestRequestJava,
                com.automation.JavaGenerate.TestResponseJava>(
                  this, METHODID_TEST_METHOD_JAVA)))
          .build();
    }
  }

  /**
   */
  public static final class TestServiceJavaStub extends io.grpc.stub.AbstractAsyncStub<TestServiceJavaStub> {
    private TestServiceJavaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceJavaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceJavaStub(channel, callOptions);
    }

    /**
     */
    public void testMethodJava(com.automation.JavaGenerate.TestRequestJava request,
        io.grpc.stub.StreamObserver<com.automation.JavaGenerate.TestResponseJava> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestMethodJavaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TestServiceJavaBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestServiceJavaBlockingStub> {
    private TestServiceJavaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceJavaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceJavaBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.automation.JavaGenerate.TestResponseJava testMethodJava(com.automation.JavaGenerate.TestRequestJava request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestMethodJavaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestServiceJavaFutureStub extends io.grpc.stub.AbstractFutureStub<TestServiceJavaFutureStub> {
    private TestServiceJavaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceJavaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceJavaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.automation.JavaGenerate.TestResponseJava> testMethodJava(
        com.automation.JavaGenerate.TestRequestJava request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestMethodJavaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST_METHOD_JAVA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestServiceJavaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestServiceJavaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST_METHOD_JAVA:
          serviceImpl.testMethodJava((com.automation.JavaGenerate.TestRequestJava) request,
              (io.grpc.stub.StreamObserver<com.automation.JavaGenerate.TestResponseJava>) responseObserver);
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

  private static abstract class TestServiceJavaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestServiceJavaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.automation.JavaGenerate.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestServiceJava");
    }
  }

  private static final class TestServiceJavaFileDescriptorSupplier
      extends TestServiceJavaBaseDescriptorSupplier {
    TestServiceJavaFileDescriptorSupplier() {}
  }

  private static final class TestServiceJavaMethodDescriptorSupplier
      extends TestServiceJavaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestServiceJavaMethodDescriptorSupplier(String methodName) {
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
      synchronized (TestServiceJavaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestServiceJavaFileDescriptorSupplier())
              .addMethod(getTestMethodJavaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
