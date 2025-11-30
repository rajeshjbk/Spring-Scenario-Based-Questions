package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("weather")
public class WeatherSatellite implements ISatellite {

	@Override
	public String transmitSignal(String location) {

		return "Transmitting weather data to "+location;
	}

}
