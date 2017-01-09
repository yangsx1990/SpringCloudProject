package com.hiersun;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/** 
  * @author  saixing_yang@hiersun.com
  * @date 创建时间：2017年1月6日 下午12:09:15 
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
