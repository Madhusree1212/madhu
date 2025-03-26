package com.fmc.speakers;

import org.springframework.stereotype.Component;

@Component("sonyspeker")
public class SonySpeaker implements Speakers {

	
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("I am playing music");

	}

}
