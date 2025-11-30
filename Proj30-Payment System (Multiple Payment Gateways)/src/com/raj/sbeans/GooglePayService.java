package com.raj.sbeans;

public class GooglePayService implements PaymentService{

	@Override
	public void pay(double amount) {
		
		System.out.println("Paid ₹"+amount+" using GooglePay");
	}
}
