package com.raj.comps;

import org.springframework.stereotype.Component;

import com.raj.factory.PaymentProcessor;

@Component("payPalProcessor")
public class PayPalProcessor implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		
		System.out.println("Processing payment via PayPal. Amount: ₹"+amount);
	}

}
