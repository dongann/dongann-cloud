package com.dongann.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DongannServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DongannServiceApplication.class, args);
    }

}
