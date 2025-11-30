package com.raj.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.Instrument;
import com.raj.sbeans.MusicBand;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {

	@Bean
	public Instrument getInstrumentObj1() {

		return new Instrument("Guitar", "String");
	}

	@Bean
	public Instrument getInstrumentObj2() {

		return new Instrument("Drums", "Percussion");
	}

	@Bean
	public Instrument getInstrumentObj3() {

		return new Instrument("Keyboard", "Electronic");
	}

	@Bean
	public MusicBand getMusicBandObj() {

		List<Instrument> instruments = new ArrayList<>();
		instruments.add(getInstrumentObj1());
		instruments.add(getInstrumentObj2());
		instruments.add(getInstrumentObj3());

		return new MusicBand("RockNation", instruments);
	}

}
