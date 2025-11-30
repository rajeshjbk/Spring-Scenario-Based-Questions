package com.raj.sbeans;

import java.time.LocalDateTime;

public class WishMessageGenerator {

	LocalDateTime currentTime;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator(): no-param constructor");

	}

	public void setCurrentTime(LocalDateTime currentTime) {
		System.out.println("WishMessageGenerator.setCurrentTime()");
		this.currentTime = currentTime;
	}

    public String generateWishMessage() {
    	
    	if(currentTime.getHour()<12) {
    		return "Good Morning";
    	}else if(currentTime.getHour()<16) {
    		return "Good AfterNoon";
    	}else if(currentTime.getHour()<20) {
    		return "Good Evening";
    	}else {
    		return "Good Night";
    	}
    }
}
