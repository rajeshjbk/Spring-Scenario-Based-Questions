package com.raj.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.MenuItem;
import com.raj.sbeans.Restaurant;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {

	@Bean
	public MenuItem getMenuItemObj1() {
		
		MenuItem item = new MenuItem();
		item.setItemId(101);
		item.setItemName("Pizza");
		item.setPrice(250);
		
		return item;
	}
	
	@Bean
	public MenuItem getMenuItemObj2() {
		
		MenuItem item = new MenuItem();
		item.setItemId(102);
		item.setItemName("Burger");
		item.setPrice(150);
		
		return item;
	}
	
	@Bean
	public MenuItem getMenuItemObj3() {
		
		MenuItem item = new MenuItem();
		item.setItemId(102);
		item.setItemName("Pasta");
		item.setPrice(200);
		
		return item;
	}
	
	@Bean
	public Restaurant getRestaurantObj() {
		
		Restaurant restaurant = new Restaurant();
		List<MenuItem> items = new ArrayList<>();
		items.add(getMenuItemObj1());
		items.add(getMenuItemObj2());
		items.add(getMenuItemObj3());
		
		restaurant.setRestaurantName("SpiceHub");
		restaurant.setMenuItems(items);
		
		return restaurant;
	}
}
