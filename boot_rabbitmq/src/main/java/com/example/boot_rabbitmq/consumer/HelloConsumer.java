package com.example.boot_rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: mingliao17
 * @CreateTime: 2020/5/17 22:54
 * @Descrption: change_the_world
 */
@Component
@RabbitListener(queuesToDeclare = @Queue("hello"))
public class HelloConsumer {

    @RabbitHandler
    public void recevice1(String message) {
        System.out.println("message" + message);
    }
}
