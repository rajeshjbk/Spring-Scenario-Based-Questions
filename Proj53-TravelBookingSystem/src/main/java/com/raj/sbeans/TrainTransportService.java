package com.raj.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TrainTransportService implements TransportService {

	@Override
	public void book(String source, String destination) {
		
		System.out.println("Booking Train From "+source+" to "+destination);

	}
}
