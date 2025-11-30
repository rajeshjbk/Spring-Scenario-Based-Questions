package com.raj.sbeans;

public class Employee {

	int empId;
	String empName;
	Department department;
	
	public Employee(int empId, String empName, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}
	
	public void showEmployeeInfo() {
		
		department.getDepartmentDetails();
		System.out.println("Employee Details:(EmpId: "+empId+", EmpName: "+empName+")");
		
	}
}
