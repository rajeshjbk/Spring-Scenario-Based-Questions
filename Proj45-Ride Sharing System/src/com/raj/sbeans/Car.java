package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {

	@Autowired
	@Qualifier("card")
	PaymentMethod card;
	
	@Override
	public String ride() {
		return "Car ride started";
	}

}
