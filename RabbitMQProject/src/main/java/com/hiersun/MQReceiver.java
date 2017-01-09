package com.hiersun;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/** 
  * @author  saixing_yang@hiersun.com
  * @date ����ʱ�䣺2017��1��6�� ����12:09:15 
  * @version 1.0 
  */
@Component
@RabbitListener(queues = "hello")
public class MQReceiver {
	@RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }
}
