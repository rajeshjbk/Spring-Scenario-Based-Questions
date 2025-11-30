package com.raj.comps;
//Dependent class
public class HomeDelivery implements DeliveryMethod {

	@Override
	public void deliverFood(String restaurantName, String dishName) {
		
       System.out.println("Home Delivery from "+restaurantName+": "+dishName+" is on its way!");
	}

}
