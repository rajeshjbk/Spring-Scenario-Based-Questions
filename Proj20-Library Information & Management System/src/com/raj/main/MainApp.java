package com.raj.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raj.sbeans.Librarian;

public class MainApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/raj/cfgs/springConfig.xml");

		Librarian librarian = ctx.getBean(Librarian.class);
		librarian.manageLibrary();
	}
}
