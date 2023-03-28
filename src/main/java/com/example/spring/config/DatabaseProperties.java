package com.example.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;
import java.util.Objects;
@Validated
@ConfigurationProperties(prefix = "db")
public record DatabaseProperties(String username,
                                String password,
                                String driver,
                                String url,
                                String hosts,
                                PoolProperties pool,
                                List<PoolProperties> pools,
                                Map<String, Objects> properties) {

    public static record PoolProperties(Integer size,
                                        Integer timeout){

    }
}
