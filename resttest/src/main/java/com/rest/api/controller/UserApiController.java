package com.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.User;
import com.rest.exception.UserNotSavedException;
import com.rest.service.UserService;

@RestController
public class UserApiController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping(value="/saveUser",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_NDJSON_VALUE)
	@ExceptionHandler(value = UserNotSavedException.class)
	public String saveUser(@RequestBody User user) {
		
		String result = userService.saveUser(user);
		return result;
	}
	
}
