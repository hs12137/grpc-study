package com.example.grpc_client_demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feign", url = "http://35.193.11.39")
public interface Feign {
    @GetMapping("feign/test")
    String test();
}
