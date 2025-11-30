package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("card")
public class CardPayment implements PaymentMethod {

	@Override
	public String pay(double amount) {
		
		return "Paid "+amount+ " using Card";
	}
	
}
