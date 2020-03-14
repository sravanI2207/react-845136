package com.abc.employee.exceptions;

public class EmployeeNotFoundException  extends RuntimeException {
	public  EmployeeNotFoundException(Integer eId) {
		super("Could not find employee " +eId);
		
	}

}
