package com.training.java.spring.SpringJDBC1;

public class Car 
{
	int CarId;
	String Make;
	String Model;
	int Year;
	String Price;

	
	//empty Constructor
	public Car()
	{
		
	}
	
	//Constructor with the fields
	public Car (int id,String make, String model, int year,String price )
	{
		this.CarId =id;
		this.Make =make;
		this.Model =model;
		this.Year=year;
		this.Price=price;
	}

	
	public Car(String make, String model, int year, String price, int id) 
	{
		
		this.CarId =id;
		this.Make =make;
		this.Model =model;
		this.Year=year;
		this.Price=price;
		
	}

	//All the getter methods
	public int getCarId() 
	{
		return CarId;
	}

	public String getMake()
	{
		return Make;
	}

	public String getModel()
	{
		return Model;
	}

	public int getYear()
	{
		return Year;
	}

	public String getPrice()
	{
		return Price;
	}
	
	
	public void setCarId(int carId) {
		CarId = carId;
	}

	public void setMake(String make) {
		Make = make;
	}

	public void setModel(String model) {
		Model = model;
	}

	public void setYear(int year) {
		Year = year;
	}

	public void setPrice(String price) {
		Price = price;
	}
	
	
}
