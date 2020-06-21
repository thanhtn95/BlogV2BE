package com.example.blogv2be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Blogv2beApplication {

    public static void main(String[] args) {
        SpringApplication.run(Blogv2beApplication.class, args);
    }

}
