package com.atriel.myredis.module.redis.service;

import com.atriel.myredis.module.redis.model.RedisParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
@RequiredArgsConstructor
public class RedisServiceImpl implements RedisService {

    private final RedisTemplate<String, String> redisTemplate;

    @Value("${spring.data.redis.host}")
    private String host;
    @Value("${spring.data.redis.port}")
    private int port;

    @Override
    public String getRedis(String key){
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public String setRedis(RedisParam param){
        String key = param.getKey();
        String value = param.getValue();
        redisTemplate.opsForValue().set(key, value);
        return value;
    }
}
