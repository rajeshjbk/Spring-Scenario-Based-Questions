package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.MusicBand;

public class MainApp {

	public static void main(String[] args) {

		try( AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class)){

			MusicBand musicBand = ctx.getBean(MusicBand.class);
			musicBand.showBandDetails();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
