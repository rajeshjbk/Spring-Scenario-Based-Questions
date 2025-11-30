package com.raj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com.raj.sbeans","com.raj.commons"})
@ImportResource("com/raj/cfgs/applicationContext.xml")
public class AppConfig {

}
