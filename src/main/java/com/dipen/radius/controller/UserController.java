package com.dipen.radius.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dipen.radius.filter.CodeOwner;

@RestController
public class UserController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@CodeOwner(name="dipen", action="controller")
	@RequestMapping("/welcome")
	public String sayHello()
	{
		logger.info("sayHello() method is consumed");
		return "Hello Dipen";
	}

}
