package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("electrical")
public class ElectricEngine implements IEngine {

	@Override
	public String start() {
		
		return "Starting Electric Engine — silent power!";
	}

}
