package com.cw.confirm;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class MessageNotToQueueReturn implements RabbitTemplate.ReturnCallback {

    /**
     * 消息没有到达交互机触发该方法
     */
    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {
        System.out.println(message);
        System.out.println("错误码是"+i);
        System.out.println("原因是"+s);
        System.out.println("该消息来自哪个交互机"+s1);
        System.out.println("该消息的路由key 是"+s2);
    }
}
