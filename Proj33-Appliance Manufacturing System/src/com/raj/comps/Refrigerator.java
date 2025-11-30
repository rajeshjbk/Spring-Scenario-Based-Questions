package com.raj.comps;

import org.springframework.stereotype.Component;

import com.raj.factory.IAppliance;

@Component("refrigerator")
public class Refrigerator implements IAppliance{

	@Override
	public void manufacture() {
		
		System.out.println("Refrigerator.manufacture()");
		System.out.println("Manufacturing Refrigerator with inverter technology.");
	}

}
