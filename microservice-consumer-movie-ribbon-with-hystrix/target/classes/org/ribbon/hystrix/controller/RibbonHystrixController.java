package org.ribbon.hystrix.controller;

import org.ribbon.hystrix.entity.User;
import org.ribbon.hystrix.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonHystrixController {
	@Autowired
	private RibbonHystrixService ribbonHystrixService;

	@GetMapping("{id}")
	public User findById(@PathVariable Long id) {
		return this.ribbonHystrixService.findById(id);
	}
}
