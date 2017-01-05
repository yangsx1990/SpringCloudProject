package com.common;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/** 
 * @author  saixing_yang@hiersun.com
 * @date 创建时间：2017年1月5日 上午11:03:08 
 * @version 1.0 
 */
@Component
public class ConsumerMQ {
	@JmsListener(destination = "test.queue")
    public void receiveQueue(String text) {
       System.out.println("接收消息：…………………………消息内容："+text);
    }
}
