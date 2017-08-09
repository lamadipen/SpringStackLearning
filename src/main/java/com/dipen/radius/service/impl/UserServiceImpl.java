package com.dipen.radius.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipen.radius.domain.User;
import com.dipen.radius.repository.UserRepository;
import com.dipen.radius.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> getUsers() throws Exception {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
		//return null;
	}
	@Override
	public User createUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
