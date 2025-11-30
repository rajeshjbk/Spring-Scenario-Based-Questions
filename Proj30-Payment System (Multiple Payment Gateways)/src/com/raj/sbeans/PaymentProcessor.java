package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class PaymentProcessor {

	@Autowired
	@Qualifier("googlePayService")
	PaymentService paymentService;
	
	public void processPayment(double amount) {
		
		paymentService.pay(amount);
	}
}
