package com.raj.sbeans;

import java.util.List;

public class MusicBand {

	String bandName;
	List<Instrument> instruments;
	
	public MusicBand(String bandName, List<Instrument> instruments) {
		super();
		this.bandName = bandName;
		this.instruments = instruments;
	}

    public void showBandDetails() {
    	
    	System.out.println("Music Band: "+bandName);
    	
    	System.out.println("Instruments Used:");
    	instruments.forEach(y -> y.showInstrument());
    }
}
