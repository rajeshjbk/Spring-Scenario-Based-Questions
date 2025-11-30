package com.raj.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.raj.main.EmployeeValidator;

public class EmployeeValidationTest {

	private static EmployeeValidator ev;
	
	@BeforeAll
	public static void setupOnce() {
		
		System.out.println("EmployeeValidationTest.setupOnce()");
		
		ev=new EmployeeValidator();
	}
	
	@Test
	public void validName() {
		
		System.out.println("EmployeeValidationTest.validName()");
		
		String name ="Rajesh";
		
		boolean expected = true;
		
		boolean actual=ev.isValidName(name);
		
		assertEquals(expected, actual);	
	}
	
	@Test
	public void inValidName() {
		
		System.out.println("EmployeeValidationTest.inValidName()");
		
		String name =" ";
		
		boolean expected = false;
		
		boolean actual=ev.isValidName(name);
		
		assertEquals(expected, actual);	
	}
	
	@Test
	public void nullName() {
		
		System.out.println("EmployeeValidationTest.nullName()");
		
		String name =null;
		
		boolean expected = false;
		
		boolean actual=ev.isValidName(name);
		
		assertEquals(expected, actual);	
	}
	
	@Test
	public void validSalary() {
		
		System.out.println("EmployeeValidationTest.validSalary()");
		
		double sal = 110000.0;
		
		boolean expected = true;
		
		boolean actual=ev.isValidSalary(sal);
		
		assertEquals(expected, actual);	
	}
	
	
	@Test
	public void inValidSalary() {
		
		System.out.println("EmployeeValidationTest.inValidSalary()");
		
		double sal = 1000.0;
		
		boolean expected = false;
		
		boolean actual=ev.isValidSalary(sal);
		
		assertEquals(expected, actual);	
	}
	
	
	@AfterAll
	public static void tearDownOnce() {
		
		System.out.println("EmployeeValidationTest.tearDownOnce()");
		
		ev=null;
	}
}
