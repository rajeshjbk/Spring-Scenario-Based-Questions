package com.raj.sbeans;

public class University {

	String universityName;
	Professor professor;
	Course course;
	
	public University(String universityName, Professor professor, Course course) {
		super();
		this.universityName = universityName;
		this.professor = professor;
		this.course = course;
	}

    public void showDetails() {
    	
    	System.out.println("University: "+universityName);
    	professor.showProfessor();
    	course.showCourse();
    }
}
