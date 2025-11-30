package com.raj.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShippingService {
	Map<String, ShippingStrategy> map;

//	@Autowired
	public ShippingService(Map<String, ShippingStrategy> map, AirShipping air) {
		super();
		this.map = map;
	}
	
	public double getShippingCost(String type, double weight) {
		
		ShippingStrategy shippingStrategy = map.get(type);
		double cost = shippingStrategy.calculateCost(weight);
		
		return cost;
	}
}
