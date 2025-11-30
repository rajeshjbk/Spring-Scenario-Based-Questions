package com.raj.comps;

import org.springframework.stereotype.Component;

import com.raj.factory.Vehicle;

@Component("truck")
public class Truck implements Vehicle{

	@Override
	public void assemble() {
		
		System.out.println("Truck.assemble()");
		System.out.println("Assembling a Truck with heavy-duty engine.");
	}
}
