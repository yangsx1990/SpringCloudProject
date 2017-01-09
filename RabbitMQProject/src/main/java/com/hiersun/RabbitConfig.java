package com.hiersun;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** 
 * @author  saixing_yang@hiersun.com
 * @date ����ʱ�䣺2017��1��6�� ����12:11:50 
 * @version 1.0 
 */
@Configuration
public class RabbitConfig {
	@Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
