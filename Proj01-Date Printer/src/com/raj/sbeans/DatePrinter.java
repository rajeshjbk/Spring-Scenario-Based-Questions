package com.raj.sbeans;

import java.time.LocalDate;

public class DatePrinter {

	LocalDate currentDate;

	public DatePrinter() {
	
		System.out.println("DatePrinter: no-param constructor");
	}
	public void setCurrentDate(LocalDate currentDate) {
		System.out.println("DatePrinter.setCurrentDate()");
		this.currentDate = currentDate;
	}
	
	public void printDate() {
		
		System.out.println("Current Date: "+currentDate);
	}
}
