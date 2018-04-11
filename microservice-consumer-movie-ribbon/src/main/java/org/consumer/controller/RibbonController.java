package org.consumer.controller;

import org.consumer.entity.User;
import org.consumer.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

	@Autowired
	private RibbonService service;

	@GetMapping("{id}")
	public User find(@PathVariable Long id) {
		return service.find(id);
	}
}
