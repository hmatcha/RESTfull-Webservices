package com.employeeproject.domain;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDAO {
	protected Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://testdbinstance.cvsdyudi1jfp.us-west-1.rds.amazonaws.com:3306/users","matcha113","matcha113");
	}

	protected void closeResources(ResultSet rs, Statement statement,
			Connection con) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (statement != null) {
				statement.close();
			}

			if (con != null) {
				con.close();
			}
		} catch (SQLException ex) {
			//Nothing to be done, ignore it.
		}
	}
}
