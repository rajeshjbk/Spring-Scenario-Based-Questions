package com.raj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.raj.comps","com.raj.factory"})
public class AppConfig {

}
