package com.example.grpc_client_demo;


import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.test.lib.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GrpcClientService {

    private final Api api;
    @GrpcClient("test")
    private TestGrpc.TestBlockingStub testStub;

    @GrpcClient("test")
    private TestGrpc.TestStub testStub2;

    public String sendMessage(final String name) {
        try{
            HelloReply response = this.testStub.sayHello(
                    HelloRequest.newBuilder()
                            .setName(name)
                            .build()
            );
            LocalDateTime time = LocalDateTime.parse(response.getTimestamp());
            System.out.println(time);
            return time + "-----" + response.getMessage();
        } catch (StatusRuntimeException e) {
            System.out.println(e);
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public List<Dto> sendListMessage(final List<Long> seatIds) {
        try{
            RepeatedReply response = this.testStub.repeatedTest(
                    RepeatedRequest.newBuilder()
                            .addAllSeatId(seatIds)
                            .build()
            );
            return response.getSeatInfoList().stream().map(Dto::fromProto).toList();
        } catch (StatusRuntimeException e) {
            System.out.println(e);
            throw new IllegalArgumentException("FAILED with " + e.getStatus().getCode().name());
        }
    }

    public void ServerStreamTest(List<Long> list) {
        Long start = System.currentTimeMillis();
        StreamObserver<ServerStreamReply> responseObserver = new StreamObserver<ServerStreamReply>() {
            @Override
            public void onNext(ServerStreamReply reply) {
                // 서버로부터 스트림으로 전송된 각각의 CouponInfo 메시지를 처리합니다.
                System.out.println("Received Title: " + reply.getTitle());
            }

            @Override
            public void onError(Throwable t) {
                // 에러 발생 시 처리
                System.err.println("Error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // 서버에서 모든 스트림 메시지를 전송한 후 처리
                Long end = System.currentTimeMillis() - start;
                System.out.println("Stream completed.   " + end);
            }
        };
        testStub2.serverStreamTest(ServerStreamRequest.newBuilder().addAllTestId(list).build(), responseObserver);
//        StreamObserver<ServerStreamReply> responseObserver = testStub.serverStreamTest(ServerStreamRequest.newBuilder().addAllTestId(list).build());
    }

    public String feignSendMessage() {
        return api.test();
    }


}
