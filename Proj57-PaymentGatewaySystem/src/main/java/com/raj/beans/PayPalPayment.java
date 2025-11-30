package com.raj.beans;

import org.springframework.stereotype.Component;

@Component("paypal")
public class PayPalPayment implements IPayment {

	@Override
	public String pay(double amount) {
		
		return "Payment of ₹"+amount+" via PayPal";
	}

}
