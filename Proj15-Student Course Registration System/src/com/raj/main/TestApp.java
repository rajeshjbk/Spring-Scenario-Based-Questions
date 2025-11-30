package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.University;

public class TestApp {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");

		University university =(University) ctx.getBean("university");
		university.displayUniversityData();
	}
}
