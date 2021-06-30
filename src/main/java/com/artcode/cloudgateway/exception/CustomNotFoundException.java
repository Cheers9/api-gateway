package com.artcode.cloudgateway.exception;

import org.springframework.stereotype.Component;

@Component
public class CustomNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String errorCode;

	String message;
	
	public CustomNotFoundException() {
		super();
	}

	public CustomNotFoundException(String message) {
		super();
		this.message = message;
	}

	public CustomNotFoundException(String errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	

}
