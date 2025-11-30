package com.raj.sbeans;

public class Employee {

	int empId;
	String empName;
	String designation;
	
	public Employee(int empId, String empName, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
	}
	
	public void getEmployeeInfo() {
		System.out.print("- Employee ["+empName+", "+designation+"]");
	}
}
