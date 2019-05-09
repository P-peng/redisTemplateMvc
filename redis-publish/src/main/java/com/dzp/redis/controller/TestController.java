package com.dzp.redis.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author dengzhipeng
 * @date 2019/05/08
 */
@Controller
@RequestMapping("test")
public class TestController {
    @Resource
    RedisTemplate<String, Object> redisTemplate;

    @RequestMapping("ok")
    @ResponseBody
    public Object ok(){
        return "ok";
    }

    @RequestMapping("listen")
    @ResponseBody
    public Object listen(){
        String channel = "chat1";
        String msg = "hello";
        redisTemplate.convertAndSend(channel, msg);
        return "listen";
    }
}
