package com.raj.sbeans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("student")
//@PropertySource("com/raj/commons/student.properties")
public class Student {

	@Value("${student.name}")
	String name;
	
	@Value("${student.marks}")
	int[] marks;
	
	@Autowired
	@Qualifier("selectedGrading")
	IGradingSystem gradingSystem;
	
	public void showResult() {
		
		System.out.println("Student Name: "+name);
		System.out.println("Student marks: "+Arrays.toString(marks));
		System.out.println("Final Grade: "+gradingSystem.calculateGrade(marks));
	}
}
