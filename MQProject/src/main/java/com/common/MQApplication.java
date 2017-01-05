package com.common;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/** 
 * @author  saixing_yang@hiersun.com
 * @date ����ʱ�䣺2017��1��5�� ����10:42:26 
 * @version 1.0 
 */
@SpringBootApplication
public class MQApplication {
	@Bean
    public Queue queue() {
		//�½�queue
       return new ActiveMQQueue("test.queue");
    }
   
    public static void main(String[] args) {
       SpringApplication.run(MQApplication.class, args);
    }
}
