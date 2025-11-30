package com.raj.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("notificationFactory")
public class NotificationFactory {

	@Autowired
	Map<String,Notifier> map;
	
	public Notifier getNotifierObj(String type) {
		
		return map.get(type);
	}
}
