package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("wallet")
public class WalletPayment implements PaymentMethod {

	@Override
	public String pay(double amount) {
		
		return "Paid "+amount+ " using Wallet";
	}
	
}
