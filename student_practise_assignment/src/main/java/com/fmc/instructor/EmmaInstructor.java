package com.fmc.instructor;

import org.springframework.stereotype.Component;

@Component("emma")
public class EmmaInstructor implements Instructor {

	public void teach() {
		System.out.println("Emma Instructor will will teaches the classes ");
	}

}
