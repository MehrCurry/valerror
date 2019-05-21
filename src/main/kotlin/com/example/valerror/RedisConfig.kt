package com.example.valerror

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.core.RedisTemplate

@Configuration
class RedisConfig(val connectionFactory: RedisConnectionFactory) {
    @Bean
    fun redisTemplate(): RedisTemplate<ByteArray, ByteArray> {
        val template = RedisTemplate<ByteArray,ByteArray>()
        template.setConnectionFactory(connectionFactory)
        template.connectionFactory=connectionFactory
    }
}
