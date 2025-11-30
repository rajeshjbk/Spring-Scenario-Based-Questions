package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Employee {

	int employeeId;
	String employeeName;
	private Project project;
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	@Autowired
	@Qualifier("project1")
	public void setProject(Project project) {
		this.project = project;
	}
	
	public void showEmployeeDetails() {
		
		System.out.print("Employee: "+employeeName+" | ");
		project.showProjectDetails();
	}
	
}
