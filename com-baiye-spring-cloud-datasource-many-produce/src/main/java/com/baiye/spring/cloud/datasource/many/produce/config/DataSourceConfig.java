package com.baiye.spring.cloud.datasource.many.produce.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig {
    //数据源1
    @Bean(name = "onedatasource")
    @ConfigurationProperties(prefix = "spring.datasource.one") // application.properteis中对应属性的前缀
    public DataSource dbXX1() {
        return DataSourceBuilder.create().build();
    }

    //数据源2
    @Bean(name = "twodatasource")
    @ConfigurationProperties(prefix = "spring.datasource.two") // application.properteis中对应属性的前缀
    public DataSource dbXX2() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 动态数据源: 通过AOP在不同数据源之间动态切换
     * @return
     */
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(dbXX1());
        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap();
        dsMap.put("dbXX1", dbXX1());
        dsMap.put("dbXX2", dbXX2());

        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }

    /**
     * 配置@Transactional注解事物
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource());
    }
}
