package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("python")
public class PythonCourse implements Course{

	@Autowired

	@Qualifier("recording")
	DeliveryMode delivery;
	@Override
	public String getCourseName() {

		return "Python for Beginners";
	}

}
