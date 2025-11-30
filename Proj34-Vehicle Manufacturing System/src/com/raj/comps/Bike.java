package com.raj.comps;

import org.springframework.stereotype.Component;

import com.raj.factory.Vehicle;

@Component("bike")
public class Bike implements Vehicle{

	@Override
	public void assemble() {
		
		System.out.println("Bike.assemble()");
		System.out.println("Assembling a Bike with lightweight alloy frame.");
	}

}
