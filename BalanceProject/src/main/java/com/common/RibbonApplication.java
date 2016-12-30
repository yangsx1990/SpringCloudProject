package com.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/** 
 * @author  saixing_yang@hiersun.com
 * @date ����ʱ�䣺2016��12��27�� ����3:30:53 
 * @version 1.0 
 */
@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker //开启熔断器
@EnableConfigServer //开启配置中心
public class RibbonApplication {

	/*@Bean
	@LoadBalanced   //�������⸺������
	RestTemplate restTemplate() {
		return new RestTemplate();
	}*/
	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}
	
}
