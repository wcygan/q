package io.wcygan.q.grpc;

import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;
import build.buf.gen.hello.v1.GreeterServiceGrpc;
import build.buf.gen.hello.v1.SayHelloRequest;
import build.buf.gen.hello.v1.SayHelloResponse;

@GrpcService
public class GreeterServiceImpl extends GreeterServiceGrpc.GreeterServiceImplBase {

    @Override
    public void sayHello(SayHelloRequest request, StreamObserver<SayHelloResponse> responseObserver) {
        String reply = "Hello " + request.getName();
        SayHelloResponse message = SayHelloResponse.newBuilder()
                .setMessage(reply)
                .build();
        responseObserver.onNext(message);
        responseObserver.onCompleted();
    }
}
