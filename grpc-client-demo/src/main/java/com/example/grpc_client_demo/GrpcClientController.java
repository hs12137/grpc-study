package com.example.grpc_client_demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.lib.SeatInfo;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class GrpcClientController {

    private final GrpcClientService grpcClientService;

    @GetMapping("client/test/grpc")
    public String printMessage() {
        return grpcClientService.sendMessage("test");
    }

    @GetMapping("client/test/feign")
    public String feignPrintMessage() {
        return grpcClientService.feignSendMessage();
    }

    @GetMapping("client/test/grpc/list")
    public List<Dto> printListMessage() {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        return grpcClientService.sendListMessage(list);
    }

    @GetMapping("client/test/grpc/stream")
    public void printStreamMessage() {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        list.add(5L);
        grpcClientService.ServerStreamTest(list);
    }
}