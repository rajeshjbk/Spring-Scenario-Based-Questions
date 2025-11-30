package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("auto")
public class Auto implements Vehicle {

	@Autowired
	@Qualifier("cash")
	PaymentMethod cash;
	
	@Override
	public String ride() {
		
		return "Auto ride started";
	}

}
