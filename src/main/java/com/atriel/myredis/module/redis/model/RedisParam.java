package com.atriel.myredis.module.redis.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RedisParam {
    private String key;
    private String value;
}
