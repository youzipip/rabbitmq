package com.cw;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RabbitmqDemoApplication {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private RabbitTemplate.ConfirmCallback confirmCallback;

    @Autowired
    private RabbitTemplate.ReturnCallback returnCallback;

    @PostConstruct
    public void setRabbitMqConfig(){
        rabbitTemplate.setConfirmCallback(confirmCallback);
        rabbitTemplate.setReturnCallback(returnCallback);
    }

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqDemoApplication.class, args);
    }

}
