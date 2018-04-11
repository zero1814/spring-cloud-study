package org.consumer.service;

import org.consumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

	@Autowired
	private RestTemplate template;

	public User find(Long id) {
		String url = "http://microservice-provider-user/" + id;
		User user = template.getForObject(url, User.class);
		return user;
	}
}
