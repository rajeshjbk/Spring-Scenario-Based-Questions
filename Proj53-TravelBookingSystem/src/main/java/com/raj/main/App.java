package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.BookingManager;

public class App {
    public static void main(String[] args) {

         try(AnnotationConfigApplicationContext ctx =
        		 new AnnotationConfigApplicationContext(AppConfig.class)){
        	 
        	 BookingManager bookingManager = ctx.getBean(BookingManager.class);
        	 
        	 bookingManager.showBookDetails("Hyd", "Delhi");
         
         }catch (Exception e) {

            e.printStackTrace();
		}
    }
}
