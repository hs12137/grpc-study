package com.example.grpc_server_demo;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.test.lib.*;

import java.time.LocalDateTime;
import java.util.List;

@GrpcService
@RequiredArgsConstructor
public class GrpcServerService extends TestGrpc.TestImplBase {
    private static final Logger log = LoggerFactory.getLogger(GrpcServerService.class);
    private final List<Dto> data;

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        LocalDateTime now = LocalDateTime.now();
        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Hello ==> " + request.getName())
                .setTimestamp(now.toString())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    @Override
    public void repeatedTest(RepeatedRequest request, StreamObserver<RepeatedReply> responseObserver) {
        System.out.println(request);
        RepeatedReply reply = RepeatedReply.newBuilder()
                .addAllSeatInfo(data
                                .stream()
                                .map(Dto::toData)
                                .toList())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void serverStreamTest(ServerStreamRequest request, StreamObserver<ServerStreamReply> responseObserver) {
        List<ServerStreamReply> list = request.getTestIdList().stream().map(testId -> {
            ServerStreamReply reply = ServerStreamReply.newBuilder()
                    .setId(testId)
                    .setTitle("wqdqw" + testId)
                    .setContent("Sdasda")
                    .build();
            log.info("reply : {}", reply);
            responseObserver.onNext(reply);
            return reply;
        }).toList();
        responseObserver.onCompleted();

        //내부로직
        list.forEach(reply -> {
            transactionalTest();
        });
    }

    public void transactionalTest() {
        //로직1
        //로직2
        //로직3
    }
}
