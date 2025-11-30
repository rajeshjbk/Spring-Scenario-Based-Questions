package com.raj.sbeans;

import java.util.List;

public class Department {

	String deptName;
	List<Manager> managers;
	
	public Department(String deptName, List<Manager> managers) {
		super();
		this.deptName = deptName;
		this.managers = managers;
	}
	
	public void showDepartmentData() {
		System.out.println("--- Department: "+deptName+" ---");
		for(Manager m:managers ) {
			m.displayAssignments();
			System.out.println();
		}
	}
}
