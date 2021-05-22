package com.artcode.cloudgateway.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class ExceptionController {

	public static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);
	

	@ExceptionHandler(CustomNotFoundException.class)
	public ResponseEntity<CustomErrorResponse> customNotFoundAdvice(final CustomNotFoundException customNotFoundException) {
		CustomErrorResponse errorResponse = new CustomErrorResponse();
		errorResponse.setErrorCode(customNotFoundException.getErrorCode());
		errorResponse.setMessage(customNotFoundException.getMessage());
		logger.error(customNotFoundException.getMessage());
		return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<CustomErrorResponse> exceptionAdvice(final Exception exception) {
		CustomErrorResponse errorResponse = new CustomErrorResponse();
		errorResponse.setErrorCode("");
		errorResponse.setMessage(exception.getMessage());
		logger.error(exception.getMessage());
		exception.printStackTrace();
		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	

}
