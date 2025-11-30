package com.raj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
@PropertySource("com/raj/commons/appInfo.properties")
public class AppConfig {

}
