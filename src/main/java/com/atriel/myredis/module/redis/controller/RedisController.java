package com.atriel.myredis.module.redis.controller;

import com.atriel.myredis.module.redis.model.RedisParam;
import com.atriel.myredis.module.redis.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class RedisController {

    private final RedisService redisService;

    @GetMapping("/redis")
    public String getRedis(@RequestParam String key) {
        return redisService.getRedis(key);
    }

    @PostMapping("/redis")
    public String setRedis(@RequestBody RedisParam param) {
        return redisService.setRedis(param);
    }
}
