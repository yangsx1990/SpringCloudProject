package com.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author saixing_yang@hiersun.com
 * @date ����ʱ�䣺2017��1��5�� ����11:31:10
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MQTest {
	@Autowired
	private ProducerMQ sender;

	@Test
	public void hello() throws Exception {
		sender.send();
	}
}
