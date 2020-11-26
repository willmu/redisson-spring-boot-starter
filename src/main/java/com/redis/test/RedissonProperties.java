package com.redis.test;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author willmu
 * @date 2020/11/26 10:30
 */
@ConfigurationProperties(prefix = "auto.redisson")
@Data
public class RedissonProperties {
    private String host = "localhost";

    private int port = 6379;

    private int timeout;

    private boolean ssl;
}
