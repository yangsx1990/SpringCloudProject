package com.hiersun.common;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/** 
 * @author  saixing_yang@hiersun.com
 * @date ����ʱ�䣺2016��12��23�� ����2:14:51 
 * @version 1.0 
 */
@EnableEurekaServer  //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class ServerApplication {
	 public static void main(String[] args) {
		  SpringApplication.run(ServerApplication.class, args);
			//new SpringApplicationBuilder(Application.class).web(true).run(args);
		}
}
