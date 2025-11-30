package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements IEngine {

	@Override
	public String start() {
		
		return "Starting Petrol Engine — smooth ignition!";
	}

}
