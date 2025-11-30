package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.Library;

public class LibraryManagementTest {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");

		Library l1 = (Library) ctx.getBean("book");
		
		l1.displayBooks();
	}
}
