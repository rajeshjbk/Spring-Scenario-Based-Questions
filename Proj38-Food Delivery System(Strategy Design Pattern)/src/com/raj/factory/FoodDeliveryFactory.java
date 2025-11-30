package com.raj.factory;

import com.raj.comps.DeliveryMethod;
import com.raj.comps.DineInDelivery;
import com.raj.comps.HomeDelivery;
import com.raj.comps.TakeawayDelivery;

public class FoodDeliveryFactory {

	public static DeliveryMethod getInstance(String deliveryMethod) {
		
		if(deliveryMethod.equalsIgnoreCase("dine-in")) {
			return new DineInDelivery();
			
		}else if(deliveryMethod.equalsIgnoreCase("takeaway")) {
			return new TakeawayDelivery();
			
		}else if(deliveryMethod.equalsIgnoreCase("home delivery")) {
			return new HomeDelivery();
			
		}else {
			throw new IllegalArgumentException("Invalid Delivery Method..");
		}
		
	}
}
