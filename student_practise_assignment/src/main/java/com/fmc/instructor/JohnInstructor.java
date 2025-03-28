package com.fmc.instructor;

import org.springframework.stereotype.Component;

@Component("john")
public class JohnInstructor implements Instructor {

	public void teach() {
		System.out.println("Here john instructor teaches the classes");
	}

}
