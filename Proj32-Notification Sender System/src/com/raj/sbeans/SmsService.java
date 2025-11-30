package com.raj.sbeans;

public class SmsService implements MessageService{

	@Override
	public void send(String message) {
		
		System.out.println("SMS sent: "+message);
		
	}
}
