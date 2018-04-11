package org.feign.hystrix.service;

import org.feign.hystrix.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "microservice-provider-user", fallback = HystrixClientFallback.class)
public interface UserFeignHystrixClient {
	@RequestMapping("{id}")
	public User find(@RequestParam("id") Long id);
}
