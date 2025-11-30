package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicle1")
public class Vehicle {

	String vehicleName;
	Engine engine;
	Tyre tyre;
	
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	public Vehicle(Engine engine) {
		super();
		this.engine = engine;
	}
   
	@Autowired
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	public void displayVehicleInfo() {
		
		engine.showEngineDetails();
		tyre.showTyreDetails();
		System.out.println("Vehicle: "+vehicleName);
		
	}
}
