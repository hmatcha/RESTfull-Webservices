package com.training.java.spring.SpringJDBC1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.training.java.spring.SpringJDBC1.CarDAO;
@Repository
public class CarDAOJDBCImpl implements CarDAO 
{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
public  List<Car> displayCars()
{

	return jdbcTemplate.query("select * from car",new CarRowMapper());

}
	
	
	
	
	public void addCar(Car car) 
	{
		 jdbcTemplate.update("insert into car values(?,?,?,?,?)",car.getCarId(),car.getMake(),car.getModel(),car.getYear(),car.getPrice() );
		
		
	}
	public void updateCar(Car car)
	
	
	{
		jdbcTemplate.update("Update car Set car_id =?, make = ?, model=?, year =? where price=?",car.getCarId(),car.getMake(),car.getModel(),car.getYear(),car.getPrice() );
		
	}
	
	private class CarRowMapper implements RowMapper<Car> 
	{

		public Car mapRow(ResultSet res, int arg1) throws SQLException
		
		{
			int id = res.getInt("Car_id");
			String make = res.getString("Make");
			String model = res.getString("Model");
			int year =res.getInt("Year");
			String price = res.getString("Price");
			
			Car car = new Car(id, make, model, year, price);
			
			car.setCarId(id);
			car.setMake(make);
			car.setModel(model);
			car.setYear(year);
			car.setPrice(price);
			
			return car;
			
			
		}
		
	}
		
	}

