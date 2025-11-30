package com.raj.sbeans;

public class CommercialBilling implements BillingStrategy{

	@Override
	public double calculateBill(double units) {
        
	   System.out.println("CommercialBilling.calculateBill()");
		return 8*units;
	}

}
