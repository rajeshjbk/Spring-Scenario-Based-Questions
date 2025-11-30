package com.raj.sbeans;

public class Principal {

	String name;
	int experience;

	public void setName(String name) {
		this.name = name;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void showPrincipalDetails() {

		System.out.println("Principal: "+name+" ("+experience+" years experince)");
	}

}
