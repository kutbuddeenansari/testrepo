package com.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.User;
import com.rest.exception.ErrorInfo;
import com.rest.exception.UserNotSavedException;
import com.rest.service.UserService;

@RestController
public class UserApiController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping(value="/saveUser",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_NDJSON_VALUE)
	public ResponseEntity<String> saveUser(@RequestBody User user)throws UserNotSavedException{
		String result = null;	
		if(HttpStatus.OK !=null) {
				result = userService.saveUser(user);
			}
			
			return ResponseEntity.ok(result);
			
		
	}
	
	@ExceptionHandler(UserNotSavedException.class)
	public ResponseEntity<ErrorInfo> userNotSavedException(UserNotSavedException e) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getErrorInfo());
	}
	
}
