package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.Employee;

public class TestApp {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx =
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");
		
		Employee employee = (Employee)ctx.getBean("emp");
		employee.showEmployeeInfo();
	}
}
