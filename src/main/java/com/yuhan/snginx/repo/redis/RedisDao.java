package com.yuhan.snginx.repo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author yuzhuJiao
 * @since 2023/08/28
 */
@Repository
public class RedisDao {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public String get(String key){
        return redisTemplate.opsForValue().get(key);
    }


}
