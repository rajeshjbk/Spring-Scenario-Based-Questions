package com.raj.sbeans;

public class Engine {

	String engineType;

	public Engine(String engineType) {
		super();
		this.engineType = engineType;
	}
	
	public void showEngineType() {
		System.out.println("Engine Type: "+engineType);
	}
	
}
