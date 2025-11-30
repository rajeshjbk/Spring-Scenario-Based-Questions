package com.raj.sbeans;

public class Course {

	int courseId;
	String courseName;
	
	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	public void showCourse() {
		
		System.out.println("Course Details: (CourseId:"+courseId+", CourseName: "+courseName+")");
	}
}
