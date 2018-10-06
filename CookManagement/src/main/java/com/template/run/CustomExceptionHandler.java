package com.template.run;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;


@RestController
@ControllerAdvice
class CustomExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleExceptionAll(Exception ex, WebRequest request) throws Exception {

		
	return new ResponseEntity<Object>( new RuntimeException("Exception has occured") ,  HttpStatus.INTERNAL_SERVER_ERROR );
}
	
}