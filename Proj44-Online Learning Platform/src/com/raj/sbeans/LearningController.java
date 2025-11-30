package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//target class
@Component("learn")
public class LearningController {

	@Autowired
	@Qualifier("java")
	JavaCourse course1;
	
	@Autowired
	@Qualifier("python")
	PythonCourse course2;
	
	@Autowired
	@Qualifier("dataSci")
	DataScienceCourse course3;


	public void enrollJavaCourse() {
		System.out.println("Enroll in "+course1.getCourseName());
		System.out.println("Deliver via "+course1.delivery.deliver(course1.getCourseName()));
	}

	public void enrollPythonCourse(){
		
		System.out.println("Enroll in "+course2.getCourseName());
		System.out.println("Deliver via "+course2.delivery.deliver(course2.getCourseName()));
	}

	public void enrollDataScienceCourse(){

		System.out.println("Enroll in "+course3.getCourseName());
		System.out.println("Deliver via "+course3.classroomDelivery.deliver(course3.getCourseName()));
	}

}
