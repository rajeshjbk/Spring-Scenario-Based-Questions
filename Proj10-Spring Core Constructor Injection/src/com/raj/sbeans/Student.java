package com.raj.sbeans;

public class Student {

	int studentId;
	String studentName;
	Course course;
	
	public Student(int studentId, String studentName, Course course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
	}
	
	public void displayStudentInfo() {
		
		System.out.println("Student Details: (StudentId: "+studentId+", StudentName: "+studentName+")");
	    course.showCourse();
	}
}
