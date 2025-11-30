package com.raj.main;

public class PriceCalculator {

	public double calculateFinalPrice(double basePrice, double taxPercentage){
		
		if(basePrice < 0 || taxPercentage < 0) {
			
			throw new IllegalArgumentException("Invalid inputs..");
		
		}else {
			
			return basePrice + (basePrice * taxPercentage / 100);
		}
	}
	
	public boolean isDiscountApplicable(double amount) {
		
		if(amount >= 500) {
			return true;
		}else {
			return false;
		}
	}
}
