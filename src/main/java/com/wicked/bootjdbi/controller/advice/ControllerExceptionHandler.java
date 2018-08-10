package com.wicked.bootjdbi.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.wicked.bootjdbi.exceptions.MissingDataException;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public String handleDataException(MissingDataException ex) {
		return ex.getMessage();
	}
}