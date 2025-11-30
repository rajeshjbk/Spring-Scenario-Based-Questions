package com.raj.comps;

import org.springframework.stereotype.Component;

import com.raj.factory.PaymentProcessor;

@Component("creditCardProcessor")
public class CreditCardProcessor implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		
		System.out.println("Processing payment via Credit Card. Amount: ₹"+amount);
	}

}
