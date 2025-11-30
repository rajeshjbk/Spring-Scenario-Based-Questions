package com.raj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.raj")
@PropertySource("com/raj/commons/engine.properties")
public class AppConfig {

	
}
