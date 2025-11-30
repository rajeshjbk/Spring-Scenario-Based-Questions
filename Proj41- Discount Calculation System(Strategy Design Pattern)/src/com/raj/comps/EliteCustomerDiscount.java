package com.raj.comps;

import org.springframework.stereotype.Component;

@Component
public class EliteCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		
		System.out.println("EliteCustomerDiscount.calculateDiscount()");
		double discount = amount*15/100.0;
		
		return discount;
	}

}
