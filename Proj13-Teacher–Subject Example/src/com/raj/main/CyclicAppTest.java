package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.Teacher;

public class CyclicAppTest {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");
		
		Teacher teacher=(Teacher) ctx.getBean("teach");
		teacher.showTeacherInfo();
	}
}
