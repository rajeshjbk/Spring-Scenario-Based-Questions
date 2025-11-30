package com.raj.sbeans;

public class Professor {


	String name;
	int yearsOfExperience;
	
	public Professor(String name, int yearsOfExperience) {
		super();
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
	}

    public void showProfessor() {
    	
    	System.out.println("Professor: "+name+" ("+yearsOfExperience+" years experience)");
    }
}
