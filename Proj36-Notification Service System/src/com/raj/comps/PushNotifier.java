package com.raj.comps;

import org.springframework.stereotype.Component;

import com.raj.factory.Notifier;

@Component("pushNotifier")
public class PushNotifier implements Notifier{

	@Override
	public void sendNotification(String message) {
		
		System.out.println("Sending Push Notification: "+message);
	}
    
}
