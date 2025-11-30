package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("cash")
public class CashPayment implements PaymentMethod {

	@Override
	public String pay(double amount) {
		
		return "Paid "+amount+ " in cash";
	}
	

}
