package com.raj.sbeans;

public class Instrument {

	String name;
	String type;
	
	public Instrument(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
   
	public void showInstrument() {
		
		System.out.println("Name: "+name+" (Type: "+type+")");
	}
}
