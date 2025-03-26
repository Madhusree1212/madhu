package com.fmc.speakers;

import org.springframework.stereotype.Component;

@Component("bosespeaker")
public class BoseSpeaker implements Speakers {

	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("using Bose speaker");

	}

}
