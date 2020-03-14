package com.abc.employee.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table")


public class EmployeeEntity {
	@Id
	@Column(name= "emp_id")

	Integer eId;
	@Column(name= "emp_name")

	String eName;
	@Column(name= "emp_salary")

	Integer eSalary;

	
	public EmployeeEntity() {
		super();
	}


	public EmployeeEntity(Integer eId, String eName, Integer eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}


	public Integer geteId() {
		return eId;
	}


	public void seteId(Integer eId) {
		this.eId = eId;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public Integer geteSalary() {
		return eSalary;
	}


	public void seteSalary(Integer eSalary) {
		this.eSalary = eSalary;
	}



}
