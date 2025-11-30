package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle {

	@Autowired
	@Qualifier("wallet")
	PaymentMethod wallet;
	
	@Override
	public String ride() {
		
		return "Bike ride started";
	}

}
