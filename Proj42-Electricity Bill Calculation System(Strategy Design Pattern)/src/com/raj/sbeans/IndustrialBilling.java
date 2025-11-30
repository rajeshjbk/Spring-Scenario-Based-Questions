package com.raj.sbeans;

public class IndustrialBilling implements BillingStrategy{

	@Override
	public double calculateBill(double units) {
        
	   System.out.println("IndustrialBilling.calculateBill()");
	   
		return 10.0*units;
	}

}
