package com.abc.employee.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.abc.employee.exceptions.EmployeeNotFoundException;

@ControllerAdvice

public class GlobalExceptionHandlerController {
	@ResponseBody
	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	Map employeeNotFoundHandler(EmployeeNotFoundException ex) {
	Map map=new HashMap();
	map.put("errorCode", HttpStatus.NOT_FOUND);
	
	
	map.put("errorMessage", ex.getMessage());
	map.put("errorDateTime", new Date());
	return map;
	
	

}
}
