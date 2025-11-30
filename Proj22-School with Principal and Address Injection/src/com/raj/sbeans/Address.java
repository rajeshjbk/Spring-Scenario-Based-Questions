package com.raj.sbeans;

public class Address {

	String city;
	String state;


	public void setCity(String city) {
		this.city = city;
	}

	
	public void setState(String state) {
		this.state = state;
	}

	public void displayAddress() {

		System.out.println("Location: "+city+", "+state);
	}

}
