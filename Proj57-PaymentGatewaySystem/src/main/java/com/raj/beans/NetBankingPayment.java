package com.raj.beans;

import org.springframework.stereotype.Component;

@Component("netbanking")
public class NetBankingPayment implements IPayment {

	@Override
	public String pay(double amount) {
		
		return "Payment of ₹"+amount+" via NetBanking";
	}

}
