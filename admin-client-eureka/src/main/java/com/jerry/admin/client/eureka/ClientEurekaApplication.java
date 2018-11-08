package com.jerry.admin.client.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com.jerry.admin")
@EnableEurekaClient
@SpringBootApplication
public class ClientEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientEurekaApplication.class, args);
    }

}
