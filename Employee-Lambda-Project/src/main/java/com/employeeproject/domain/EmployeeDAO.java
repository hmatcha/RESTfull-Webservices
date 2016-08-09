package com.employeeproject.domain;

import java.util.List;

public interface EmployeeDAO {
	
	public List<Employee> getEmployees();
	public void addEmployee (Employee employee);
	public Employee getEmployeeByID(int empID);

}
