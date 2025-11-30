package com.raj.sbeans;

public class Teacher {

	Subject subject;

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public void showTeacherInfo() {
		
		System.out.println("Teacher teaches Java.");
		subject.showSubjectInfo();
	}
}
