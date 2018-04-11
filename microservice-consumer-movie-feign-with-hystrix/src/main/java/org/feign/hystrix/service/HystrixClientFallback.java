package org.feign.hystrix.service;

import org.feign.hystrix.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements UserFeignHystrixClient {
	private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

	@Override
	public User find(Long id) {
		HystrixClientFallback.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
		User user = new User();
		user.setId(-1L);
		user.setUsername("default username");
		user.setAge(0);
		return user;
	}

}
