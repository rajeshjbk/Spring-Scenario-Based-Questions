package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.BookingManager;

public class App {
    public static void main(String[] args) {

    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		BookingManager bookingManager1 = ctx.getBean(BookingManager.class);
    		bookingManager1.bookTicket("Delhi", "Chennai");
    		System.out.println();
    		BookingManager bookingManager2 = ctx.getBean(BookingManager.class);
    		bookingManager2.bookTicket("Hyderabad", "Mumbai");
    		System.out.println("bookingManager1 hashcode: "+bookingManager1.hashCode());
    		System.out.println("bookingManager2 hashcode: "+bookingManager2.hashCode());
    	}catch (Exception e) {
			
		}
    }
}
