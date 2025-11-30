package com.raj.sbeans;

import java.util.Map;

public class Manager {

	String managerName;
	Map<Employee, Project> assignments;
	
	public Manager(String managerName, Map<Employee, Project> assignments) {
		super();
		this.managerName = managerName;
		this.assignments = assignments;
	}
	
	public void displayAssignments() {
		
		System.out.println("Manager: "+managerName);
		System.out.println("Assignments:");
		assignments.forEach((x,y)->{
			x.getEmployeeInfo();
			y.getProjectInfo();
		});
		
		
	}
}
