package com.raj.comps;

import org.springframework.stereotype.Component;

import com.raj.factory.Notifier;

@Component("emailNotifier")
public class EmailNotifier implements Notifier{

	@Override
	public void sendNotification(String message) {
		
		System.out.println("Sending Email Notification: "+message);
	}

}
