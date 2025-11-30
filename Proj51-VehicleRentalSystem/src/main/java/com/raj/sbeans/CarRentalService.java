package com.raj.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CarRentalService implements VehicleService {

	@Override
	public void rent(String customer) {
		
		System.out.println("Renting Car to "+customer);
	}

}
