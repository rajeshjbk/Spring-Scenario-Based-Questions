package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.DatePrinter;

public class DatePrinterTest {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = 
				      new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");
		
		Object obj = ctx.getBean("dprinter");
		
		DatePrinter date = (DatePrinter)obj;
		
		date.printDate();
	}
}
