package com.raj.sbeans;

public class Department {

	int deptId;
	String deptName;

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public void departmentInfo() {
		
		System.out.println("DeptID -> "+deptId +"     DeptName -> "+deptName);
	}
}
