package com.common;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/** 
 * @author  saixing_yang@hiersun.com
 * @date ����ʱ�䣺2017��1��5�� ����11:03:08 
 * @version 1.0 
 */
@Component
public class ConsumerMQ {
	@JmsListener(destination = "test.queue")
    public void receiveQueue(String text) {
       System.out.println("������Ϣ������������������������Ϣ���ݣ�"+text);
    }
}
