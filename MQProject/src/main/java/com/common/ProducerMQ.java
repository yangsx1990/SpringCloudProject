package com.common;


import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/** 
 * @author  saixing_yang@hiersun.com
 * @date ����ʱ�䣺2017��1��5�� ����10:59:46 
 * @version 1.0 
 */
@Component
//@EnableScheduling    //��ʱ������
public class ProducerMQ {
	 @Autowired
	 private JmsMessagingTemplate jmsMessagingTemplate;
	 
	 @Autowired
	 private Queue queue;
	 
	 //@Scheduled(fixedDelay=3000)//ÿ3sִ��1��
    public void send() {
    	System.out.println("������Ϣ����������������������");
       this.jmsMessagingTemplate.convertAndSend(this.queue, "hi,activeMQ");
    }
}
