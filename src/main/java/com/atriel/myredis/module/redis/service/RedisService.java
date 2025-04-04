package com.atriel.myredis.module.redis.service;

import com.atriel.myredis.module.redis.model.RedisParam;

public interface RedisService {
    String getRedis(String key);
    String setRedis(RedisParam param);
}
