package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//target class
public class RideController {

	@Autowired
	@Qualifier("car")
	Car car;
	
	@Autowired
	@Qualifier("bike")
	Bike bike;
	
	@Autowired
	@Qualifier("auto")
	Auto auto;
	
	public void bookCar(double amount) {
		
		System.out.println(car.ride());
		System.out.println(car.card.pay(amount));
		
	}
	
	public void bookBike(double amount) {
		
		System.out.println(bike.ride());
		System.out.println(bike.wallet.pay(amount));
	}
	
	public void bookAuto(double amount) {
		
		System.out.println(auto.ride());
		System.out.println(auto.cash.pay(amount));
	}	
}
