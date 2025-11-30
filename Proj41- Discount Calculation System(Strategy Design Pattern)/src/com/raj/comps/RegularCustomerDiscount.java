package com.raj.comps;

import org.springframework.stereotype.Component;

@Component
public class RegularCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		System.out.println("RegularCustomerDiscount.calculateDiscount()");
		double discount = amount*5/100.0;
		
		return discount;
	}

}
