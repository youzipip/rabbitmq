package com.cw.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "google")
public class NiubiListener {

    @RabbitHandler
    public void handlerMessage(String message){
        System.out.println(message);
    }
}
