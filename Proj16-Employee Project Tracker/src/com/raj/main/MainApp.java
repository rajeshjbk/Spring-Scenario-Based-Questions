package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.Department;

public class MainApp {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");
		
		Department department =(Department) ctx.getBean("department");
		department.showDepartmentData();
	}
}
