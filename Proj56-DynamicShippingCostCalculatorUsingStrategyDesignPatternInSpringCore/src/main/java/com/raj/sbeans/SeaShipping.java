package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sea")
public class SeaShipping implements ShippingStrategy {

	@Value("${shipping.sea.base}")
	double seaBase;
	
	@Value("${shipping.sea.perKg}")
	double perKg;
	@Override
	public double calculateCost(double weight) {
		
		return seaBase+perKg*weight;
	}

}
