package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("recording")
public class RecordedDelivery implements DeliveryMode {

	@Override
	public String deliver(String courseName) {
		
		return "Recorded Video";
	}

}
