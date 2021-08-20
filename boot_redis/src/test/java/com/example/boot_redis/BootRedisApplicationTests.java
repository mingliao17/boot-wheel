package com.example.boot_redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
class BootRedisApplicationTests {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        log.info("为人所不为，这本身就是进步！");
        redisTemplate.opsForValue().set("mingliao", "但是你要先为了再说2！", 18000);
        redisTemplate.opsForValue().getAndSet("mingliao", "但是你要先为了再说3！");
        String value = (String) redisTemplate.opsForValue().get("mingliao");
        log.info("value=" + value);
        log.info(String.valueOf(redisTemplate.hasKey("mingliao")));
    }


    @Test
    void StringTest() {
        log.info(stringRedisTemplate.opsForValue().get("mingliao"));
    }

}
