package com.training.java.spring.SpringJDBC1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarServiceLayer
{
	@Autowired
	private CarDAO dao;

	public List<Car> getAllCars()
	
	{
		List<Car> allcars =dao.displayCars();
		 List<Car>fordCars = new ArrayList<Car>();
		 
		 for (Car car: allcars)
		 {
			if(car.getMake().equalsIgnoreCase("Ford"))
			{
				fordCars.add(car);
			}
		 }
		
		return fordCars;
		
		
	}
	

	public void addCar(Car car)
	{
		
	}

}
