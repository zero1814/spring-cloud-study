package org.feign.service;

import org.feign.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "microservice-provider-user")
public interface FeignService {

	@RequestMapping("{id}")
	public User find(@RequestParam("id") Long id);
}
