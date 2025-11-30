package com.raj.sbeans;

public class ResidentialBilling implements BillingStrategy{

	@Override
	public double calculateBill(double units) {

		System.out.println("ResidentialBilling.calculateBill()");
		return 8*units;
	}

}
