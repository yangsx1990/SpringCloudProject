package com.common;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/** 
 * @author  saixing_yang@hiersun.com
 * @date 创建时间：2017年1月5日 上午10:42:26 
 * @version 1.0 
 */
@SpringBootApplication
public class MQApplication {
	@Bean
    public Queue queue() {
		//新建queue
       return new ActiveMQQueue("test.queue");
    }
   
    public static void main(String[] args) {
       SpringApplication.run(MQApplication.class, args);
    }
}
