package com.example.clientservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ClientServiceApplication {

    @Value("${book-service.url}")
    private static String bookServiceUrl;

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
        System.out.println(bookServiceUrl);
    }

}