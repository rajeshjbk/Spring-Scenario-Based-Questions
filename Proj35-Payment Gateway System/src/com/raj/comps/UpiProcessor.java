package com.raj.comps;

import org.springframework.stereotype.Component;

import com.raj.factory.PaymentProcessor;

@Component("upiProcessor")
public class UpiProcessor implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		
		System.out.println("Processing payment via UPI. Amount: ₹"+amount);
	}

}
