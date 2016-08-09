package com.employeeproject.domain;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class EmployeeDAODemo implements RequestHandler<Integer, Employee> {
	EmployeeService service = new EmployeeService();

	@Override
	public Employee handleRequest(Integer empID, Context context) {

		Employee employee = service.fetchEmployeeByID(empID);
		context.getLogger().log(
				"employee ID : " + employee.getEmpID() + " \n" + "empName = "
						+ employee.getEmpName());
		return employee;
	}
}
