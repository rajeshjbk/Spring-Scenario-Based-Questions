package com.raj.sbeans;

public class Course {

	int courseId;
	String courseName;
	
	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	public void showCourseInfo() {
		
		System.out.println("- "+courseName);
	}
}
