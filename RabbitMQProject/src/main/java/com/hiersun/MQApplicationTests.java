package com.hiersun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * @author  saixing_yang@hiersun.com
 * @date 创建时间：2017年1月6日 下午12:17:02 
 * @version 1.0 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RabbitApplication.class)
public class MQApplicationTests {
	@Autowired
    private MQSender sender;
    @Test
    public void hello() throws Exception {
        sender.send();
    }
}	
