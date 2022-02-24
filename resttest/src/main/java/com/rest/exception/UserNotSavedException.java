package com.rest.exception;

public class UserNotSavedException extends RuntimeException{

	public UserNotSavedException() {
		super();
	}

	public UserNotSavedException(String message) {
		super(message);
	}
	
}
