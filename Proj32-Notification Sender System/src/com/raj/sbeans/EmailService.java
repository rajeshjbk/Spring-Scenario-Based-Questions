package com.raj.sbeans;

public class EmailService implements MessageService{

	@Override
	public void send(String message) {
		
		System.out.println("Email sent: "+message);
	}
}
