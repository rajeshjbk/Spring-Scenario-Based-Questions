package com.raj.sbeans;

public class Person {

	String name;
	Address address;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayInfo() {
		
		System.out.println("Name: "+name);
		System.out.println("Address: ("+address.city+", "+address.country+")");
	}
}
