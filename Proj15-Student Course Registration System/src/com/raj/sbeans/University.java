package com.raj.sbeans;

import java.util.List;

public class University {

	String universityName;
	List<Student> students;
	 
	public University(String universityName, List<Student> students) {
		super();
		this.universityName = universityName;
		this.students = students;
	}
	 
	 public void displayUniversityData() {
		 
		 System.out.println("--- University: " + universityName+ " ---");
		 
		 for(Student stu:students) {
			 
			 stu.showStudentDetails();
			 System.out.println();
		 }
	 }
}
