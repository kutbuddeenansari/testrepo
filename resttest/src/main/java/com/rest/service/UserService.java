package com.rest.service;

import org.springframework.stereotype.Service;

import com.rest.entity.User;
import com.rest.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	
	public String saveUser(User user) {
		userRepository.save(user);
		return "Saved";
	}

}
