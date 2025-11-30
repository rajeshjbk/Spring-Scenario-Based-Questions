package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.NotificationService;

public class MainApp {

public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			NotificationService notification = ctx.getBean("notification",NotificationService.class);
			notification.notifyUser("Meeting at 4 PM");
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
