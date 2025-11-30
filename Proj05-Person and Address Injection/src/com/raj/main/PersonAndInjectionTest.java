package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.Person;

public class PersonAndInjectionTest {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");

	    Person p1 =	(Person)ctx.getBean("person");
	    p1.displayInfo();
	    
	    ctx.close();
	}
}
