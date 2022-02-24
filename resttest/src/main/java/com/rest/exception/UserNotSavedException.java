package com.rest.exception;

public class UserNotSavedException extends Exception{
	private static final long serialVersionUID = -2438197029700435887L;

	protected ErrorInfo errorInfo;

	public UserNotSavedException(int errorCode, String errorMessage) {
		errorInfo = fromErrorInfo(errorCode, errorMessage);
	}

	public UserNotSavedException(String message, int errorCode, String errorMessage) {
		super(message);
		errorInfo = fromErrorInfo(errorCode, errorMessage);
	}

	public UserNotSavedException(Throwable cause, int errorCode, String errorMessage) {
		super(cause);
		errorInfo = fromErrorInfo(errorCode, errorMessage);
	}

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	private ErrorInfo fromErrorInfo(int errorCode, String errorMessage) {
		ErrorInfo errorInfo = null;

		errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(errorCode);
		errorInfo.setErrorMessage(errorMessage);
		return errorInfo;
	}

	
}
