package com.raj.sbeans;

public class WhatsAppService implements MessageService{

	@Override
	public void send(String message) {
		
		System.out.println("WhatsApp sent: "+message);		
	}

}
