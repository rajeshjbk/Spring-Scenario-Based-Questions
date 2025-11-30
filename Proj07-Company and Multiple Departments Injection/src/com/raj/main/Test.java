package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.Company;

public class Test {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx =
				   new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");
		
		Company companies = (Company)ctx.getBean("company");
		
		companies.showDepartments();
	}
}
