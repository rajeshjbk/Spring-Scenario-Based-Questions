package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.main.NotificationApp;
import com.raj.sbeans.EmailNotification;
import com.raj.sbeans.SMSNotification;
import com.raj.sbeans.WhatsAppNotification;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {

	@Bean(name="email")
	public EmailNotification getInstance1() {
		
		return new EmailNotification();
	}
	
	@Bean(name="sms")
	public SMSNotification getInstance2(){
	
		return new SMSNotification();
	}
	
	@Bean(name="whatsapp")
	public WhatsAppNotification getInstance3() {
		
		return new WhatsAppNotification();
	}
	
	@Bean
	public NotificationApp getInstance() {
		
		return new NotificationApp();
	}
}
