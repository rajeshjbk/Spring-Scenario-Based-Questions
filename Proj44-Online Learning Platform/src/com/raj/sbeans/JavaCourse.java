package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourse implements Course{

	@Autowired
	@Qualifier("online")
	DeliveryMode delivery;
	
	@Override
	public String getCourseName() {
	
		return "Java Programming ";
	}
}
