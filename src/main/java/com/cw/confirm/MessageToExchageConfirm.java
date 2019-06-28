package com.cw.confirm;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class MessageToExchageConfirm implements RabbitTemplate.ConfirmCallback {

    /**
     * 消息到达交互机触发该方法
     * @param correlationData
     * @param b
     * @param s
     */
    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        if(b){
            System.out.println(correlationData);
        }else{
            System.out.println("没有签收的原因"+s);
        }
    }
}
