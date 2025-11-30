package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("communication")
public class CommunicationSatellite implements ISatellite {

	@Override
	public String transmitSignal(String location) {

		return "Transmitting communication signals to "+location;
	}

}
