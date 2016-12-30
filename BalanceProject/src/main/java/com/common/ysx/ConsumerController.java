package com.common.ysx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author saixing_yang@hiersun.com
 * @date ����ʱ�䣺2016��12��27�� ����3:31:51
 * @version 1.0
 */
@RestController
public class ConsumerController {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	private ComputeService computeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String add() {
		return restTemplate.getForEntity(
				"http://compute-service/add?a=10&b=20", String.class).getBody();
	}
	/**
	 * 调用熔断器配置的Service
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUpdate() {
		return computeService.addService();
	}
}
