package com.yuhan.snginx.repo.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author yuzhuJiao
 * @since 2023/08/28
 */
@Configuration
public class RedisLock {

    @Value("${redis.address:redis://localhost:6379}")
    private String redisHost;

    private Config buildConfig() {
        Config config = new Config();
        config.useSingleServer().setAddress(redisHost);
        return config;
    }

    @Bean
    protected RedissonClient getClient() {
        return Redisson.create(buildConfig());
    }
}
