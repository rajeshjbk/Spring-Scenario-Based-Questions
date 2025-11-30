
package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("vi")
public class ViSim implements ISimCard {

	@Override
	public String getSimDetails() {
		
		return "Vi SIM: 4G Network, ₹249/month";
	}

}
