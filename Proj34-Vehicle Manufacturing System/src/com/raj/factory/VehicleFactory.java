package com.raj.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("vehicleFactory")
public class VehicleFactory {

	@Autowired
	Map<String,Vehicle> map;
	
	public Vehicle getVehicle(String type) {
	
		Vehicle vehicle = map.get(type);
		return vehicle;
	}
}
