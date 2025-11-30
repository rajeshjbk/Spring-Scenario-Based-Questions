package com.raj.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.raj.main.ArithmeticService;

public class ArithmeticServiceTest {

	private static ArithmeticService ar;
	
	@BeforeAll
	public static void setupOnce() {
		System.out.println("ArithmeticServiceTest.setupOnce()");
		ar = new ArithmeticService();
	}
	
	@Test
	public void addWithPositiveValues() {
		System.out.println("ArithmeticServiceTest.addWithPositiveValues()");
	
		int a=100;
		int b=200;
		
		int expected=300;
		
		int actual = ar.add(a,b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void addWithNegativeValues() {
		System.out.println("ArithmeticServiceTest.addWithNegativeValues()");
		int a=-100;
		int b=-200;
		
		int expected=-300;
		
		int actual = ar.add(a,b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void addWithMixedValues() {
		System.out.println("ArithmeticServiceTest.addWithMixedValues()");
		int a=-100;
		int b=200;
		
		int expected=100;
		
		int actual = ar.add(a,b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void addWithZeroValues() {
		
		int a=0;
		int b=0;
		
		int expected=0;
		
		int actual = ar.add(a,b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void subWithPositiveValues() {
		System.out.println("ArithmeticServiceTest.subWithPositiveValues()");
		int a=300;
		int b=200;
		
		int expected=100;
		
		int actual = ar.subtract(a,b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void subWithNegativeValues() {
		
		int a=-300;
		int b=-200;
		
		int expected=-100;
		
		int actual = ar.subtract(a,b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void subWithZeroValues() {
		System.out.println("ArithmeticServiceTest.subWithZeroValues()");
		int a=0;
		int b=0;
		
		int expected=0;
		
		int actual = ar.subtract(a,b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public  void mulWithPositiveValues() {
		System.out.println("ArithmeticServiceTest.mulWithPositiveValues()");
		int a=30;
		int b=20;
		
		int expected=600;
		
		int actual = ar.multiply(a,b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void mulWithNegativeValues() {
		System.out.println("ArithmeticServiceTest.mulWithNegativeValues()");
		int a=-30;
		int b=-20;
		
		int expected=600;
		
		int actual = ar.multiply(a,b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void mulWithZeroValues() {
		System.out.println("ArithmeticServiceTest.mulWithZeroValues()");
		int a=30;
		int b=20;
		
		int expected=600;
		
		int actual = ar.multiply(a,b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void divWithPositiveValues() {
		System.out.println("ArithmeticServiceTest.divWithPositiveValues()");
		double a=100;
		double b=20;
		
		double expected=5.0;
		
		double actual = ar.divide(a,b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void divWithBZeroValues() {

	    int a = 100;
	    int b = 0;

	    if(b==0)
	    assertThrows(IllegalArgumentException.class, () -> {
	        throw new IllegalArgumentException("B value must > 0");
	    });
	}
	
	@AfterAll
	public static void tearDownOnce() {
		
		System.out.println("ArithmeticServiceTest.tearDownOnce()");
	    ar =null;
	}
}
