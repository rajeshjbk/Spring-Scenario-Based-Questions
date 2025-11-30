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
	
	public void getProjectInfo() {
		
		System.out.println(" -> Project ["+ projectName+"]");
	}
}
