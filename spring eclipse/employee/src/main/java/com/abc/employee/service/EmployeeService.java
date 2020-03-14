package com.abc.employee.service;

import java.util.List;

import com.abc.employee.model.EmployeePojo;

public interface EmployeeService {
	List<EmployeePojo> getAllEmployees();
	EmployeePojo getEmployee(Integer eId);
	void deleteEmployee(Integer eId);
	EmployeePojo addEmployee(EmployeePojo empPojo);
	EmployeePojo updateEmployee(EmployeePojo empPojo);
	

}
