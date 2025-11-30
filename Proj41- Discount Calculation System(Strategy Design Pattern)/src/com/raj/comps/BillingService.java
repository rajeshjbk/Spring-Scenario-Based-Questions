package com.raj.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bs")
public class BillingService {

	@Autowired
	@Qualifier("premiumCustomerDiscount")
	DiscountStrategy discountStrategy;

	public void generateBill(double amount) {
		System.out.println("BillingService.generateBill()");
		double discount = discountStrategy.calculateDiscount(amount);
		System.out.println("Original Amount: ₹"+amount);
		System.out.println("Discount Applies: ₹"+discount);
		System.out.println("Final Payable Amount: ₹"+(amount-discount));
	}
}
