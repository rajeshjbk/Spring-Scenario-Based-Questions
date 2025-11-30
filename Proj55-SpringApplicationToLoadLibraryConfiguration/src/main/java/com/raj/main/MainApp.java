package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.Library;

public class MainApp {
    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext ctx =
        		new AnnotationConfigApplicationContext(AppConfig.class)){
        	
        	Library library = ctx.getBean(Library.class);
        	library.displayLibraryInfo();
        }catch (Exception e) {
			e.printStackTrace();
		}
    }
}
