package com.abc.employee.model;

public class EmployeePojo {
	private int eId;
	private String eName;
	private Integer eSalary;
	
	public EmployeePojo() {
		super();
	}
	
	public EmployeePojo(int eId, String eName, Integer integer) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = integer;
	}
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
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
