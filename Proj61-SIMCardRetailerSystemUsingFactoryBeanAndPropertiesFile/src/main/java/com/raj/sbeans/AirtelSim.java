
package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("airtel")
public class AirtelSim implements ISimCard {

	@Override
	public String getSimDetails() {
		
		return "Airtel SIM: 5G Network, ₹299/month";
	}
}
