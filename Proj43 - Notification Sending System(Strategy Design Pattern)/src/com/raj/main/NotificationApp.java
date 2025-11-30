package com.raj.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.NotificationService;
import com.raj.sbeans.NotificationStrategy;

public class NotificationApp {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class);
				Scanner sc = new Scanner(System.in)){
			
			System.out.print("Enter notification type (email/sms/whatsapp): ");
			String beanType = sc.nextLine().toLowerCase();
			
			System.out.print("Enter message: ");
			String msg = sc.nextLine();
			
			NotificationStrategy notificationStrategy = ctx.getBean(beanType,NotificationStrategy.class);
			
			NotificationService notificationService = new NotificationService();
			notificationService.setNotificationStrategy(notificationStrategy);
			
			notificationService.notifyUser(msg);
		}catch (Exception e) {
			
		}
	}
}
