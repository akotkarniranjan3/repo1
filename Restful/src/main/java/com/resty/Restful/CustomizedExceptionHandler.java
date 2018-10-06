package com.resty.Restful;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler {

 
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleExceptionAll(Exception ex, WebRequest request) throws Exception {
		ExceptionResponse er = new ExceptionResponse(new Date() , request.getDescription(false));
	return new ResponseEntity(er , HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
	}
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request)
	{
		ExceptionResponse er = new ExceptionResponse(new Date() , "String Validation Failed");
		return new ResponseEntity(er , HttpStatus.BAD_REQUEST);
	}
	
	
	
}
