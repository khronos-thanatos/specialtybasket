package com.jonny.specialtybasket.eureka.specialtyeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpecialtyEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpecialtyEurekaApplication.class, args);
    }
}
