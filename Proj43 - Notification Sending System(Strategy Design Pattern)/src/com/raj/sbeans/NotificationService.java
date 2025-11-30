package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//target class
@Component
public class NotificationService {

	NotificationStrategy notificationStrategy;
	
	@Autowired
	public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
		this.notificationStrategy = notificationStrategy;
	}

	public void notifyUser(String message) {
		
		notificationStrategy.send(message);
		
	}
}
