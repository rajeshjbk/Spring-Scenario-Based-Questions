package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component
public class WhatsAppNotification implements NotificationStrategy {

	@Override
	public void send(String message) {

		System.out.println("Notification sent successfully via WhatsApp: \n"+message);
	}

}
