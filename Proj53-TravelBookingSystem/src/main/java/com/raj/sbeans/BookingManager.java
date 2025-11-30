package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BookingManager {

	@Autowired
	@Qualifier("flightTransportService")
	TransportService service;
	
	public void showBookDetails(String source, String destination) {
		
		service.book(source, destination);
	}
}
