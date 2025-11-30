package com.raj.main;

import java.util.Scanner;

import com.raj.comps.Transportation;
import com.raj.comps.TravelBooking;
import com.raj.factory.TransportationFactory;

public class MainTest {

	public static void main(String[] args) {
		
		try(Scanner scn = new Scanner(System.in)){
			
			System.out.print("Enter Transport type: ");
			String type = scn.nextLine();
			
			TravelBooking booking = new TravelBooking();
			Transportation transportation = TransportationFactory.getInstance(type);
			
			booking.setTransportation(transportation);
			
			System.out.print("Enter Your Destination: ");
			String dest = scn.nextLine();
			System.out.print("Enter Price: ");
			double price = Double.parseDouble(scn.nextLine());
		   
			booking.executeBooking(dest, price);
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
