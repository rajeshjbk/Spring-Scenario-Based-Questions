package com.raj.sbeans;

public class Department {

	String deptName;
	int deptId;
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public void showDepartment() {
		
		System.out.println("Department ID: "+deptId+", Name: "+deptName);
	}
}
