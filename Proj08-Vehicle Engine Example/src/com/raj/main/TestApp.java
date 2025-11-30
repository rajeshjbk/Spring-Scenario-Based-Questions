package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.Car;

public class TestApp {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx =
				   new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");
		
		Car car = (Car)ctx.getBean("car");
		car.displayCarDetails();
		
		ctx.close();
	}
}
