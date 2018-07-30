package com.baiye.spring.cloud.datasource.many.produce.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSourceContextHolder {
    private static Logger logger = LoggerFactory.getLogger("UploadLogger");
    /**
     * 默认数据源
     */
    public static final String DEFAULT_DS = "dataFol";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    // 设置数据源名
    public static void setDB(String dbType) {
        logger.info("切换到{"+dbType+"}数据源");
        contextHolder.set(dbType);
    }

    // 获取数据源名
    public static String getDB() {
        return (contextHolder.get());
    }

    // 清除数据源名
    public static void clearDB() {
        contextHolder.remove();
    }
}
