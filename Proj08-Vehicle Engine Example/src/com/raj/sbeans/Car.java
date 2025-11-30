package com.raj.sbeans;

public class Car {

	Engine engine;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}
	
	public void displayCarDetails() {
		
		System.out.println("Car is running with "+engine.engineType+" engine");
		
	}
}
