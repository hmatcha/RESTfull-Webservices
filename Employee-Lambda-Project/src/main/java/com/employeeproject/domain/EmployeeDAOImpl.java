package com.employeeproject.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl extends BaseDAO implements EmployeeDAO {

	@Override
	public List<Employee> getEmployees() {

		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		List<Employee> employees = new ArrayList<Employee>();
		try {
			con = getConnection();
			statement = con.createStatement();

			rs = statement.executeQuery("select * from employee");

			while (rs.next()) {
				int empID = rs.getInt("empID");
				String empName = rs.getString("empName");

				Employee employee = new Employee(empID, empName);
				employees.add(employee);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeResources(rs, statement, con);
		}
		return employees;
	}

	@Override
	public void addEmployee(Employee employee) {

		Connection con = null;
		PreparedStatement statement = null;

		try {
			con = getConnection();

			String sql = "insert into employee(empName) values (?)";
			statement = con.prepareStatement(sql);
			statement.setString(1, employee.getEmpName());
			System.out.println(sql.toString());

			int rowsInserted = statement.executeUpdate();

			System.out.println("rowsInserted = " + rowsInserted);
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeResources(null, statement, con);
		}
	}

	@Override
	public Employee getEmployeeByID(int empID) {

		Connection con = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			String sql = "select * from employee where empID =?";
			statement = con.prepareStatement(sql);
			statement.setInt(1, empID);
			rs = statement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("empID");
				String name = rs.getString("empName");
				Employee employee = new Employee(id, name);

				return employee;
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeResources(null, statement, con);
		}

		return null;
	}

}
