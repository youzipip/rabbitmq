package com.cw.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    /**
     * 创建广播交互机
     * @return
     */
    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanout.exc");
    }

    /**
     * 新建三个队列
     * @return
     */
    @Bean
    public Queue queue1(){
        return new Queue("queue1");
    }

    @Bean
    public Queue queue2(){
        return new Queue("queue2");
    }

    @Bean
    public Queue queue3(){
        return new Queue("queue3");
    }

    /**
     * 绑定队列交互机
     * @return
     */
    @Bean
    public Binding binding1(){
        return BindingBuilder.bind(queue1()).to(fanoutExchange());
    }
    @Bean
    public Binding binding2(){
        return BindingBuilder.bind(queue2()).to(fanoutExchange());
    }
    @Bean
    public Binding binding3(){
        return BindingBuilder.bind(queue3()).to(fanoutExchange());
    }
}
