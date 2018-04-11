package org.provider.controller;

import org.provider.entity.User;
import org.provider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;

	@Autowired
	private DiscoveryClient client;

	@GetMapping("{id}")
	public User find(@PathVariable Long id) {
		User user = repository.findOne(id);
		return user;
	}

	/**
	 * 本地服务实例的信息
	 * 
	 * @return
	 */
	@SuppressWarnings("deprecation")
	@GetMapping("/instance-info")
	public ServiceInstance showInfo() {
		ServiceInstance localServiceInstance = client.getLocalServiceInstance();
		return localServiceInstance;
	}
}
