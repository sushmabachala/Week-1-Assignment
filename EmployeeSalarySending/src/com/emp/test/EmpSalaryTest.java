package com.emp.test;

import com.emp.beans.Company;
import com.emp.beans.Employee;
import com.emp.beans.Subject;

public class EmpSalaryTest {
	
	
	public static void main(String[] args) {
		
		Subject company = new Company();
		
		Employee e1 = new Employee("Anand");
		Employee e2 = new Employee("Raja");
		Employee e3 = new Employee("Prakash");
		Employee e4 = new Employee("Malli");
		Employee e5 = new Employee("Kannan");

		company.addNewEmployee(e1);
		company.addNewEmployee(e2);
		company.addNewEmployee(e3);
		company.addNewEmployee(e4);
		company.addNewEmployee(e5);
		
		company.sendSalary("40000");
		
		company.removeEmployee(e5);
		
		company.showAllEmployee();

		
		
	}

}
