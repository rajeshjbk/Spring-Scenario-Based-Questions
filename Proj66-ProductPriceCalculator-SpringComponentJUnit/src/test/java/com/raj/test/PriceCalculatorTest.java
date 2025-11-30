package com.raj.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.raj.main.PriceCalculator;

public class PriceCalculatorTest {

	private static PriceCalculator calc;
	
	@BeforeAll
	public static void setupOnce() {
		
		System.out.println("PriceCalculatorTest.setupOnce()");
		
		calc=new PriceCalculator();
	}
	
	@Test
	public void validBasePrice() {
		System.out.println("PriceCalculatorTest.validPrice()");
		double basePrice=1000;
		double taxPer=10;
		
		double expected=1100.0;
		double actual=calc.calculateFinalPrice(basePrice, taxPer);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void negativeBasePrice() {
		
		System.out.println("PriceCalculatorTest.negativeBasePrice()");
	    
		double basePrice=-1000;
		
		if(basePrice<0) {
			assertThrows(IllegalArgumentException.class, ()->{
				throw new IllegalArgumentException("basePriceMust Be basePrice > 0"); 
		    });
		}
	}
	
	@Test
	public void zeroTax() {
		
		System.out.println("PriceCalculatorTest.zeroTax()");
		
		double tax = 0;
		
		if(tax==0) {
			
			assertThrows(IllegalArgumentException.class, ()->{
				throw new IllegalArgumentException("Tax must not be zero.."); 
		    });
		}
	}
	
	@Test
	public void discountApplicableOrNot() {
		
		System.out.println("PriceCalculatorTest.discountApplicableOrNot()");
		
		double amount =600.0;
		
		if(amount>500) {
			
			boolean expected = true;
			
			boolean actual=calc.isDiscountApplicable(amount);
			
			assertEquals(expected, actual);
		}else {
			
            boolean expected = false;
			boolean actual=calc.isDiscountApplicable(amount);
			
			assertEquals(expected, actual);
		}
	}
	
	@AfterAll
	public static void tearDownOnce() {
		
		System.out.println("PriceCalculatorTest.tearDownOnce()");
		calc=null;
	}
}
