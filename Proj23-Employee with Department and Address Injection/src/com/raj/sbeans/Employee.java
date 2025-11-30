package com.raj.sbeans;

public class Employee {

	int empId;
	String empName;
	Department department;
	Address address;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public void showEmployeeDetails() {
		
		System.out.println("Employee:: ID: "+empId+", Name: "+empName);
		department.showDepartment();
		address.showAddress();
	}
	
}
