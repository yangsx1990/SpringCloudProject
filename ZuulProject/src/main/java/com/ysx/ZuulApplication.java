package com.ysx;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/** 
 * @author  saixing_yang@hiersun.com
 * @date ����ʱ�䣺2017��1��4�� ����10:02:40 
 * @version 1.0 
 */
@EnableZuulProxy  //����zuul
@SpringCloudApplication  //������@SpringBootApplication��@EnableDiscoveryClient��@EnableCircuitBreaker����ҪĿ�Ļ��Ǽ�����
public class ZuulApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
	}
	
	//ʵ����������
	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
}
