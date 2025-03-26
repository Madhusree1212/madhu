package com.fmc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fmc.implementation.Tyres;
import com.fmc.speakers.Speakers;

@Component
public class VehicleService {	
	private Tyres tyres;
	private Speakers speakers;
	@Autowired
	public VehicleService(@Qualifier("bridgestone") Tyres tyres, @Qualifier("bosespeaker") Speakers speakers) {
	    this.tyres = tyres;
	    this.speakers = speakers; 
	}
	public void music() {
		speakers.sound();
	}
	public void move() {
		tyres.rotate();
	}
	
	
}
