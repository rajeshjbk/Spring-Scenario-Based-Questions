package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {

	
	public double calculateTax(double amount) {
		
		return amount*18/100.0;
	}
}
