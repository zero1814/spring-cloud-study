package org.feign.controller;

import org.feign.entity.User;
import org.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

	@Autowired
	private FeignService service;

	@GetMapping("{id}")
	public User find(@PathVariable Long id) {
		return service.find(id);
	}
}
