package com.example.grpc_server_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GrpcServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcServerDemoApplication.class, args);
	}

	@Bean
	public List<Dto> data() {
		return new Data().getList();
	}

}
