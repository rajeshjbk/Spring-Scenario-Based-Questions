package com.raj.comps;

import org.springframework.stereotype.Component;

import com.raj.factory.Vehicle;

@Component("car")
public class Car implements Vehicle{

	@Override
	public void assemble() {
		
		System.out.println("Car.assemble()");
		System.out.println("Assembling a Car with automatic transmission.");
	}
}
