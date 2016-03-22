package com.training.java.spring.SpringJDBC1;

import java.util.List;

public interface CarDAO 
{
	List<Car> displayCars();
	public void addCar(Car car);
	public void updateCar(Car car);

}
