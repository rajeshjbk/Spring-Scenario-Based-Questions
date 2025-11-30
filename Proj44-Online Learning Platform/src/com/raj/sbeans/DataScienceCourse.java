package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dataSci")
public class DataScienceCourse implements Course{

	@Autowired
	@Qualifier("classroom")
	DeliveryMode classroomDelivery;
	
	@Override
	public String getCourseName() {
	
		return "Data Science with ML ";
	}

}
