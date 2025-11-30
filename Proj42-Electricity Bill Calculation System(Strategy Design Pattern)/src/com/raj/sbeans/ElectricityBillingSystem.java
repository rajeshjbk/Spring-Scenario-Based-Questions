package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Target class
@Component
public class ElectricityBillingSystem {

//	@Autowired
//	@Qualifier("commercial")
	BillingStrategy billingStrategy;
	
//	@Autowired
	public void setBillingStrategy(BillingStrategy billingStrategy) {
		this.billingStrategy = billingStrategy;
	}

	public void showBill(double units) {
			
		System.out.println("Total Bill Amount: ₹"+billingStrategy.calculateBill(units));
	}
}
