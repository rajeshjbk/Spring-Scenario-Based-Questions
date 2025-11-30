package com.raj.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("paymentFactory")
public class PaymentFactory {

	@Autowired
	Map<String,PaymentProcessor> map;
	
	public PaymentProcessor getPaymentProcessorObj(String type) {
		
		return map.get(type);
	}
}
