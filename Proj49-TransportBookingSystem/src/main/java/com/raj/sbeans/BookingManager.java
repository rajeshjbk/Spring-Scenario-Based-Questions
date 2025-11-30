package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BookingManager {

    private final TrainTransportService trainTransportService;

	@Autowired
	@Qualifier("busService")
	TransportService transportService;

    BookingManager(TrainTransportService trainTransportService) {
        this.trainTransportService = trainTransportService;
    }
	
	public void bookTicket(String src, String dest) {
		
		System.out.println("BookingManager HashCode: "+this.hashCode());
	    System.out.println("TransportService HashCode: "+trainTransportService.hashCode());
	    
	    trainTransportService.book(src,dest);
	}
}
