package com.hiersun.common;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.config.server.EnableConfigServer;


/** 
 * @author  saixing_yang@hiersun.com
 * @date ����ʱ�䣺2016��12��23�� ����2:14:51 
 * @version 1.0 
 */
@EnableDiscoveryClient //激活Eureka中的DiscoveryClient实现，才能实现Controller中对服务信息的输出。
@SpringBootApplication
public class Client2Application {
	 public static void main(String[] args) {
	        SpringApplication.run(Client2Application.class, args);
	    }
}
