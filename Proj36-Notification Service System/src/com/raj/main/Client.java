package com.raj.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.factory.NotificationFactory;

public class Client {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
				Scanner scn = new Scanner(System.in)){
			
			System.out.print("Enter Notification type: ");
			String type = scn.nextLine();
			
			System.out.print("Enter Notification : ");
			String message = scn.nextLine();
			
			NotificationFactory notificationFactory = ctx.getBean(NotificationFactory.class);
			notificationFactory.getNotifierObj(type).sendNotification(message);
			
		}catch (Exception e) {
		
			e.printStackTrace();
		}
	}
}
