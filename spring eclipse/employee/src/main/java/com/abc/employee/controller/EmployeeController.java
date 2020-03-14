package com.abc.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abc.employee.model.EmployeePojo;
import com.abc.employee.service.EmployeeService;

@RestController
@RequestMapping("api")
@CrossOrigin
public class EmployeeController {
	@Autowired
	EmployeeService empService;
@GetMapping("/employee/all")
List<EmployeePojo>getAllEmployees(){
//EmployeeService empService=new EmployeeSeviceImpl();

	return empService.getAllEmployees();
}

@GetMapping("/employee/{employeeId}")
EmployeePojo getEmployee(@PathVariable("employeeId") Integer empId) {
return empService.getEmployee(empId);
}

@DeleteMapping("/employee/{employeeId}")

	void deleteEmployee(@PathVariable("employeeId") Integer empId) {
	empService.deleteEmployee(empId);

}
@PostMapping("/employee")
 EmployeePojo addEmployee(@RequestBody EmployeePojo empPojo) {
	return empService.addEmployee(empPojo);
}
@PutMapping("/employee")
EmployeePojo updateEmployee(@RequestBody EmployeePojo empPojo) {
	return empService.updateEmployee(empPojo);
}

}
