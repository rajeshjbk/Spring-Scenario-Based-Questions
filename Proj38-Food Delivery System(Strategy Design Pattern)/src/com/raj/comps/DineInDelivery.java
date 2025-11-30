package com.raj.comps;
//Dependent class
public class DineInDelivery implements DeliveryMethod {

	@Override
	public void deliverFood(String restaurantName, String dishName) {
		
         System.out.println("Dine-in at "+restaurantName+": Enjoying "+dishName);
	}

}
