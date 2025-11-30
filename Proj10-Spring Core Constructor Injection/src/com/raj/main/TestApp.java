package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.Student;


public class TestApp {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx =
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");
		
	    Student student = (Student)ctx.getBean("stu");
	    student.displayStudentInfo();
	}
}
