package com.dipen.radius.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dipen.radius.domain.User;
import com.dipen.radius.filter.CodeOwner;
import com.dipen.radius.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@CodeOwner(name="dipen", action="controller")
	@RequestMapping("/welcome")
	public String sayHello()
	{
		logger.info("sayHello() method is consumed");
		return "Hello Dipen";
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public @ResponseBody List<User> getUsers() throws Exception
	{
		userService.createUser(new User("Dipen"));
		userService.createUser(new User("Leo"));
		userService.createUser(new User("King"));
		
		List<User> users = userService.getUsers();
		
		return users;
	}
	
	
}
