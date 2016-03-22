package com.training.java.spring.SpringJDBC1;

import java.util.List;

public interface CarServiceLayer 

{
	List<Car> getAllCars();
	void addCar (Car car);

}
