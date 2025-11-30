package com.raj.sbeans;

import java.util.List;

public class Student {

	int studentId;
	String studentName;
	List<Course> enrolledCourses;
	
	public Student(int studentId, String studentName, List<Course> enrolledCourses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.enrolledCourses = enrolledCourses;
	}
	
	public void showStudentDetails() {
		
		System.out.println("Student ID: "+studentId +" | Name: "+studentName);
		System.out.println("Courses Enrolled:");
		for(Course course : enrolledCourses) {
			course.showCourseInfo();
		}
	}
}
