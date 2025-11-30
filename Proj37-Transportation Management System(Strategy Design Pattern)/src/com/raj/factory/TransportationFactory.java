package com.raj.factory;

import com.raj.comps.BusTransportation;
import com.raj.comps.FlightTransportation;
import com.raj.comps.TrainTransportation;
import com.raj.comps.Transportation;

public class TransportationFactory {

	public static Transportation getInstance(String trasptMethod) {
		
		if(trasptMethod.equalsIgnoreCase("bus")) {
		   return new BusTransportation();
		}else if(trasptMethod.equalsIgnoreCase("train")) {
		    return new TrainTransportation();
		}else if(trasptMethod.equalsIgnoreCase("flight")) {
		    return new FlightTransportation();
		}else {
			throw new IllegalArgumentException("Invalid Transport Type");
		}
	}
}
