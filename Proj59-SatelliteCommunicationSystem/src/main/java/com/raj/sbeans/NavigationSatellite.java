package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("navigation")
public class NavigationSatellite implements ISatellite {

	@Override
	public String transmitSignal(String location) {

		return "Transmitting GPS data to "+location;
	}

}
