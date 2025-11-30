package com.raj.comps;

import org.springframework.stereotype.Component;

import com.raj.factory.IAppliance;

@Component("washingMachine")
public class WashingMachine implements IAppliance{

	@Override
	public void manufacture() {
		
		System.out.println("WashingMachine.manufacture()");
	    System.out.println("Manufacturing Washing Machine with smart sensors.");	
	}

}
