package com.baiye.spring.cloud.server.eureka.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ComBaiyeSpringCloudServerEurekaOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComBaiyeSpringCloudServerEurekaOneApplication.class, args);
    }
}
