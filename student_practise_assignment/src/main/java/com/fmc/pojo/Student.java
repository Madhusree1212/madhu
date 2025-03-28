package com.fmc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	private Course course;
	
	public void apply() {
		System.out.println("Students are applying the courses");
		course.start();
	}

}
