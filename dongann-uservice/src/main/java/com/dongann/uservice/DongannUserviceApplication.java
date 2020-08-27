package com.dongann.uservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DongannUserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DongannUserviceApplication.class, args);
    }

}
