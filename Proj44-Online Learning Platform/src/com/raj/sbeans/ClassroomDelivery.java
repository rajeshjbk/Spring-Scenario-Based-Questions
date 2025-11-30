package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("classroom")
public class ClassroomDelivery implements DeliveryMode {

	@Override
	public String deliver(String courseName) {
		
		
		return courseName+"In-Person Classroom";
	}

}
