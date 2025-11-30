package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SatelliteControlCenter {

	@Autowired
	@Qualifier("selectedSatellite")
	ISatellite iSatellite;
	
	public void activateSatellite(String location) {
		
		System.out.println(iSatellite.transmitSignal(location));
	}
}
