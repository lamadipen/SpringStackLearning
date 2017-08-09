package com.dipen.radius.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/welcome")
	public String sayHello()
	{
		return "Hello Dipen";
	}

}
