package com.example.grpc_client_demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Api {
    private final Feign feign;

    public String test() {
        return feign.test();
    }
}
