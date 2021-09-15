package com.emp.beans;

public interface EmpInterface {

	String getEmpName();

	void setEmpName(String empName);

	void updateSalaryNotification(EmpInterface emp, String salary);

}