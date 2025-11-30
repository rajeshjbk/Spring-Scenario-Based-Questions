package com.raj.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BikeRentalService implements VehicleService {

	@Override
	public void rent(String customer) {
		
		System.out.println("Renting Bike to "+customer);
	}

}
