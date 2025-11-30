package com.raj.comps;

import org.springframework.stereotype.Component;

@Component
public class PremiumCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		
		System.out.println("PremiumCustomerDiscount.calculateDiscount()");
		double discount = amount*10/100.0;
		
		return discount;
	}

}
