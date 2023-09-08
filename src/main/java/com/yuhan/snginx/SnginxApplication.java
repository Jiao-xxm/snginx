package com.yuhan.snginx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SnginxApplication {

    public static final Logger LOGGER = LoggerFactory.getLogger(SnginxApplication.class);

    @PostConstruct
    public void logTest() {
        LOGGER.error("error");
        LOGGER.warn("warning");
        LOGGER.info("info");    // 默认的日志级别信息
        LOGGER.debug("debug");
        LOGGER.trace("trace");  // 追踪信息
    }

    public static void main(String[] args) {
        SpringApplication.run(SnginxApplication.class, args);
    }

}
