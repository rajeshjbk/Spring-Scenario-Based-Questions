package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RentalManager {

	@Autowired
	@Qualifier("bikeRentalService")
//	@Qualifier("carRentalService")
   VehicleService service;	
	
   public void showStatus(String customer) {
	   
	   service.rent(customer);

   }
}
