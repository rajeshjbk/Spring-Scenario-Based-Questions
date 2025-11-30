package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.EmailService;
import com.raj.sbeans.MessageService;
import com.raj.sbeans.NotificationService;
import com.raj.sbeans.SmsService;
import com.raj.sbeans.WhatsAppService;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {

	@Bean(name="emailService")
	public MessageService getEmailServiceObj() {
		
		return new EmailService();
	}
	
	@Bean(name="smsService")
	public MessageService getSmsServiceObj() {
		
		return new SmsService();
	}
	
	@Bean(name="whatsAppService")
	public MessageService getWhatsAppServiceObj() {
		
		return new WhatsAppService();
	}
	
	@Bean(name="notification")
	public NotificationService getNotificationObj() {
		
		return new NotificationService();
	}
}
