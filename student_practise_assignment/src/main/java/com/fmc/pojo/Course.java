package com.fmc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Course {
	
	private   CourseService courseservice;
	
	public Course(CourseService courseservice) {
		this.courseservice=courseservice;
	}
	
	public void start() {
		courseservice.study();
		courseservice.learn();
	}

}
