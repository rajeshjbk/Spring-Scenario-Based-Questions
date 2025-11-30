package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.DiscountCalculator;

public class DiscountCalculatorTest {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");

		DiscountCalculator cal=(DiscountCalculator) ctx.getBean("discalculator");

		cal.calculateDiscount();
	}
}
