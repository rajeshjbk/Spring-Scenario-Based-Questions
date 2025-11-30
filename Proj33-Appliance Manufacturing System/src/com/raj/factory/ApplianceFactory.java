package com.raj.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("applianceFactory")
public class ApplianceFactory {

	@Autowired
	Map<String,IAppliance> map;
	
	public IAppliance getAppliance(String type) {
		
		IAppliance appliance = map.get(type);
		return appliance;

	}	
	
	
	/* 2nd approach
	 * 
	 * public IAppliance getAppliance(String type) {
	 * 
	 * if(type.equalsIgnoreCase("washingMachine")) {
	 * 
	 * return new WashingMachine(); }else if(type.equalsIgnoreCase("refrigerator")){
	 * 
	 * return new Refrigerator(); } else { throw new IllegalArgumentException(); } }
	 */
}
