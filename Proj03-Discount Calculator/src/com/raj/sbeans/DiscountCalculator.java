package com.raj.sbeans;

import java.time.LocalDate;

public class DiscountCalculator {

	LocalDate currentDate;
	double price;

	public DiscountCalculator() {
		System.out.println("DiscountCalculator(): no-param constructor");
	}

	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public void calculateDiscount() {

		double discountPrice = 0;

		if(currentDate.getDayOfWeek().equals("SUNDAY") || currentDate.getDayOfWeek().equals("SATURDAY")) {
			
			discountPrice = price - (price*.2);
			System.out.println("Discounted Price: "+discountPrice+" (20% discount applied)");
		}else {
			
			discountPrice = price - (price*.1);
			System.out.println("Discounted Price: "+discountPrice+" (10% discount applied)");
		}
	}
}
