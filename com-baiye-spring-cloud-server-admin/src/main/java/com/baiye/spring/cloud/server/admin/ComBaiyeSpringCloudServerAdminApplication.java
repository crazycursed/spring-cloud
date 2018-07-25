package com.baiye.spring.cloud.server.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages = "com.baiye.spring.cloud.server.admin.dao")
public class ComBaiyeSpringCloudServerAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComBaiyeSpringCloudServerAdminApplication.class, args);
    }
}
