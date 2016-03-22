package com.training.java.spring.SpringJDBC1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDAOJdbcImplTest {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		CarServiceLayer service = context.getBean(CarServiceLayer.class);
		
		List<Car>allcars =service.getAllCars();
		for (Car fordCars: allcars)
		{
			System.out.println("Car Id = "+ fordCars.getCarId());
			System.out.println("Car Make = "+ fordCars.getMake());
			System.out.println("Car Model = "+ fordCars.getModel());
			System.out.println("Car Year = "+ fordCars.getYear());
			System.out.println("Car Price = "+ fordCars.getPrice() + "\n");
			System.out.println("****************************************************** \n");
		}
		
		
		
	}

}
