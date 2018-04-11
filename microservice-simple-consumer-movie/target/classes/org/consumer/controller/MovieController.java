package org.consumer.controller;

import org.consumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user/")
public class MovieController {

	@Autowired
	private RestTemplate template;

	@GetMapping("{id}")
	public User find(@PathVariable Long id) {
		String url = "http://localhost:8080/user/" + id;
		return template.getForObject(url, User.class);
	}
}
