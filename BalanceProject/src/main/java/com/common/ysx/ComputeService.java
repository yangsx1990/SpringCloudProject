package com.common.ysx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author saixing_yang@hiersun.com
 * @date 创建时间：2016年12月30日 下午4:44:37
 * @version 1.0
 */
@Service
public class ComputeService {

	/*@Autowired
	RestTemplate restTemplate;*/

	/*@HystrixCommand(fallbackMethod = "addServiceFallback")
	public String addService() {
		return restTemplate.getForEntity(
				"http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
	}

	public String addServiceFallback() {
		return "error";
	}*/
}
