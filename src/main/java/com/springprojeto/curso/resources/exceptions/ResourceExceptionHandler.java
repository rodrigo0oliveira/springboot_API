package com.springprojeto.curso.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springprojeto.curso.services.exceptions.DataBaseException;
import com.springprojeto.curso.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandartError> resourceNotFound(ResourceNotFoundException e,HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandartError stardart = new StandartError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());
		
		return ResponseEntity.status(status).body(stardart);
	}
	
	@ExceptionHandler(DataBaseException.class)
	public ResponseEntity<StandartError> dataBase(DataBaseException e,HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandartError stardart = new StandartError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());
		
		return ResponseEntity.status(status).body(stardart);
	}

}
