package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {

	@Autowired
	@Qualifier("eFactory")
	IEngine engine;
	
	@Value("${car.name}")
	String name;
	
	@Value("${car.price}")
	int price;
	
	
	public void showCarDetails(){
		
		System.out.println("Car Name: "+name);
		System.out.println("Price: "+price);
		System.out.println(engine.start());
	}
}
