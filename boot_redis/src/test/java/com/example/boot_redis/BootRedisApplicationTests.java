package com.example.boot_redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
class BootRedisApplicationTests {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 取得锁，
     * @param key String  设置key
     * @param value String 设置value
     * @param  expireTime 过期时间
     * */
    public boolean getLock(String key, String value, int expireTime){

        // 设置锁，设置前判断Key是否已存在，不存在则，设置key，value，
        // 然后返回true。
        // 如果锁已存在 则返回false，
        if(redisTemplate.opsForValue().setIfAbsent(key,value)){
            // 设置Key过期时间，防止死锁
            redisTemplate.expire(key,expireTime, TimeUnit.SECONDS);
            return true;
        } else {
            return false;
        }
    }

    /**
     * 释放锁，如果锁不存在
     * */
    public boolean releaseLock(String key){
        return redisTemplate.delete(key);
    }

    @Test
    void jiasuo(){
        boolean getlock = getLock("mingliao","我是一个定时任务",100-000);
        System.out.println(getlock);
    }

    @Test
    void jiesuo(){
        boolean result = releaseLock("mingliao");
        System.out.println(result);
    }

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
        log.info(redisTemplate.opsForValue().get("mingliao"));
    }



}
