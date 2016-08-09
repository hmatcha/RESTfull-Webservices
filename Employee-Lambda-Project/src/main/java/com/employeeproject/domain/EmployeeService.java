package com.employeeproject.domain;

import java.util.List;

public class EmployeeService {

	EmployeeDAO dao = new EmployeeDAOImpl();

	public List<Employee> fetchEmployeesFromDatabase() {
		return dao.getEmployees();
	}

	public void insertEmployeeInDatabaseTable(Employee employee) {
		dao.addEmployee(employee);
	}

	public Employee fetchEmployeeByID(int empID)

	{
		return dao.getEmployeeByID(empID);
	}
}
