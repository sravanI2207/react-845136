package com.abc.employee.service;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.employee.dao.EmployeeDao;
import com.abc.employee.dao.entity.EmployeeEntity;
import com.abc.employee.exceptions.EmployeeNotFoundException;
import com.abc.employee.model.EmployeePojo;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
	@Autowired
	EmployeeDao empDao;
	@Override
	public List<EmployeePojo> getAllEmployees() {
		List<EmployeePojo>  allEmpPojo = new ArrayList();
		Iterable<EmployeeEntity> allEmpEntity = empDao.findAll();
		Iterator itr = allEmpEntity.iterator();
		while(itr.hasNext()) {
			EmployeeEntity empEntity=  (EmployeeEntity) itr.next();
			EmployeePojo empPojo = new EmployeePojo(empEntity.geteId(), empEntity.geteName(), empEntity.geteSalary());
			allEmpPojo.add(empPojo);
		}

		return allEmpPojo;
	}

	@Override
	public EmployeePojo getEmployee(Integer eId) {
		EmployeePojo empPojo=null;
		Optional<EmployeeEntity> optional = empDao.findById(eId);
		if(optional.isPresent()) {
			EmployeeEntity empEntity = optional.get();
			empPojo = new EmployeePojo(empEntity.geteId(),empEntity.geteName(),empEntity.geteSalary());
		}
		else {
			throw new EmployeeNotFoundException(eId);
			
		}
		return empPojo;
	}

	@Override
	public void deleteEmployee(Integer eId) {
		empDao.deleteById(eId);
		
	}

	@Override
	public EmployeePojo addEmployee(EmployeePojo empPojo) {
		EmployeeEntity empEntity = new EmployeeEntity(empPojo.geteId(), empPojo.geteName(),empPojo.geteSalary());
	empDao.save(empEntity);
	return empPojo;
	}

	@Override
	public EmployeePojo updateEmployee(EmployeePojo empPojo) {
		EmployeeEntity empEntity = new EmployeeEntity(empPojo.geteId(), empPojo.geteName(),empPojo.geteSalary());
		empDao.save(empEntity);
		return empPojo;
		
	}

}
