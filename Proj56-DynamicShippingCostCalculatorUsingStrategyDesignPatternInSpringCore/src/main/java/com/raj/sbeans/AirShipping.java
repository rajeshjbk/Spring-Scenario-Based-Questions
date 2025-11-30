package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("air")
public class AirShipping implements ShippingStrategy {

	@Value("${shipping.air.base}")
	double airBase;
	
	@Value("${shipping.air.perKg}")
	double perKg;
	@Override
	public double calculateCost(double weight) {
		
		return airBase+perKg*weight;
	}

}
