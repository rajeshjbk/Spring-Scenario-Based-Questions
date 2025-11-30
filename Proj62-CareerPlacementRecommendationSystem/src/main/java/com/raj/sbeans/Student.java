package com.raj.sbeans;


public class Student {

	private String name;
	
	private int rollNo;
	
	private String addrs;

	public Student(String name, int rollNo, String addrs) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", addrs=" + addrs + "]";
	}
}
