package org.feign.hystrix.controller;

import org.feign.hystrix.entity.User;
import org.feign.hystrix.service.UserFeignHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHystrixController {

	@Autowired
	private UserFeignHystrixClient service;

	@GetMapping("{id}")
	public User find(@PathVariable Long id) {
		return service.find(id);
	}
}
