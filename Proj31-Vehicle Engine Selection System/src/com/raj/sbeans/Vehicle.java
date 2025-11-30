package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle {

	@Autowired
	@Qualifier("electricEngine")
	Engine engine;
	
	public void startVehicle() {
		
		engine.start();
	}
}
