package com.dzp.subscibe.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author dengzhipeng
 * @date 2019/05/08
 */
public class RedisMessageListener implements MessageListener {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * @return the redisTemplate
     */
    public RedisTemplate<String, Object> getRedisTemplate() {
        return redisTemplate;
    }

    /**
     * @param redisTemplate the redisTemplate to set
     */
    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void onMessage(Message message, byte[] pattern) {
        System.out.println("info");
    }
}
