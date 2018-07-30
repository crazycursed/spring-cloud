package com.baiye.spring.cloud.datasource.many.produce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableTransactionManagement
@EnableCaching //开启缓存
@MapperScan(basePackages = "com.baiye.spring.cloud.datasource.many.produce.dao")
public class ComBaiyeSpringCloudDatasourceManyProduceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComBaiyeSpringCloudDatasourceManyProduceApplication.class, args);
	}
}
