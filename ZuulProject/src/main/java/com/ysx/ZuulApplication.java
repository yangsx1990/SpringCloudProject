package com.ysx;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/** 
 * @author  saixing_yang@hiersun.com
 * @date 创建时间：2017年1月4日 上午10:02:40 
 * @version 1.0 
 */
@EnableZuulProxy  //开启zuul
@SpringCloudApplication  //整合了@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker，主要目的还是简化配置
public class ZuulApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
	}
	
	//实例化过滤器
	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
}
