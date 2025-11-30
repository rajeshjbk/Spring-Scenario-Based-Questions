package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("road")
public class RoadShipping implements ShippingStrategy {

	@Value("${shipping.road.base}")
	double roadBase;
	
	@Value("${shipping.road.perKg}")
	double perKg;
	@Override
	public double calculateCost(double weight) {
		
		return roadBase+perKg*weight;
	}

}
