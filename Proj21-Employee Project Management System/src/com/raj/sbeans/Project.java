package com.raj.sbeans;

public class Project {

	int projectId;
	String projectName;
	int duration;
	
	public Project(int projectId, String projectName, int duration) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.duration = duration;
	}
	
	public void showProjectDetails() {
		
		System.out.println("Project: "+projectName +" ("+duration+" Months)");
	}

}
