package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements IEngine {

	@Override
	public String start() {
		
		return "Starting Diesel Engine — high torque mode!";
	}

}
