package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.GooglePayService;
import com.raj.sbeans.PaymentProcessor;
import com.raj.sbeans.PaymentService;
import com.raj.sbeans.PaytmPaymentService;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {

	@Bean
	public PaymentService getPaytmPaymentServiceObj() {
		
		return new PaytmPaymentService();
	}
	
	@Bean(name="googlePayService")
	public PaymentService getGooglePayServiceObj() {
		
		return new GooglePayService();
	}
	
	@Bean
	public PaymentProcessor getPaymentProcessorObj() {
		
		return new PaymentProcessor();
	}
}
