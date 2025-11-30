package com.raj.beans;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPayment implements IPayment {

	@Override
	public String pay(double amount) {
		
		return "Payment of ₹"+amount+" via UPI";
	}

}
