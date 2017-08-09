package com.dipen.radius.service;

import java.util.List;

import com.dipen.radius.domain.User;


public interface UserService {

	List<User> getUsers() throws Exception;
	User createUser(User user) throws Exception;
}
