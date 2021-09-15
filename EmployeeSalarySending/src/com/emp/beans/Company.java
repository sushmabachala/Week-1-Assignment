package com.emp.beans;

import java.util.ArrayList;
import java.util.List;

public class Company implements Subject {
	
	private List<Employee> empList = new ArrayList<>();
		

	@Override
	public void addNewEmployee(Employee emp) {
		empList.add(emp);
	}
     
	@Override
	public void removeEmployee(EmpInterface emp) {
		System.out.println("Employee Resigned ");
		empList.remove(emp);
		System.out.println(emp.getEmpName());
	}
	
	@Override
	public void showAllEmployee() {
		System.out.println("Total employees ");
		for(EmpInterface employee : empList) {
			System.out.println(employee.getEmpName());
		}
	}
	
	@Override
	public void sendSalary(String salary) {
		for(EmpInterface employee : empList) {
			employee.updateSalaryNotification(employee,salary);
		}
	}
}
