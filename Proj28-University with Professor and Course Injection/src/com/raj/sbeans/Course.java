package com.raj.sbeans;

public class Course {


	String courseName;
	int duration ;
	
	public Course(String courseName, int duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}
   
	public void showCourse() {
		
		System.out.println("Course: "+courseName+" (Duration: "+duration+" months)");
	}
    
}
