package com.raj.comps;

import org.springframework.stereotype.Component;

import com.raj.factory.Notifier;

@Component("smsNotifier")
public class SmsNotifier implements Notifier{

	@Override
	public void sendNotification(String message) {
		
		System.out.println("Sending SMS Notification: "+message);
	}

}
