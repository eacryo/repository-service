package com.eacryo.repositoryservice.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class MqReceiver {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver  : " + msg);
    }
}
