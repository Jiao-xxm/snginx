package com.yuhan.snginx.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuzhuJiao
 * @since 2023/08/27
 */
@Configuration
@MapperScan("com.yuhan.snginx.repo.mysql.mapper")
public class ServiceConfig {



}
