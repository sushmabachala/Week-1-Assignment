package com.emp.beans;

public class Employee implements EmpInterface {
	
	private String empName;
	
	private Subject company;
	
	
	@Override
	public String getEmpName() {
		return empName;
	}


	@Override
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Employee(String empName) {
		this.empName = empName;
	}


	@Override
	public void updateSalaryNotification(EmpInterface emp ,String salary) {
		System.out.println("Salary recieved for the employee "+empName+"===> "+salary+" rupees" );
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", company=" + company + "]";
	}

	
	
}
