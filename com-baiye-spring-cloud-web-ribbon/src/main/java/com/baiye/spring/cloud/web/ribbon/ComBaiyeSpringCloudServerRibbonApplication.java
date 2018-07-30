package com.baiye.spring.cloud.web.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ComBaiyeSpringCloudServerRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComBaiyeSpringCloudServerRibbonApplication.class, args);
	}
}

