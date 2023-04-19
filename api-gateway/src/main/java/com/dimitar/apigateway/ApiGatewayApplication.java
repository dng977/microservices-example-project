package com.dimitar.apigateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApiGatewayApplication.class);
//        app.setDefaultProperties(Collections
//                .singletonMap("server.port", "9095"));
        app.run(args);
    }
}
