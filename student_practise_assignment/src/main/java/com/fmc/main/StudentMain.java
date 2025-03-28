package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.config.StudentConfig;
import com.fmc.pojo.Student;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		Student s=context.getBean(Student.class);
		System.out.println("Students are geeting courses");
		s.apply();
	
	}
}
