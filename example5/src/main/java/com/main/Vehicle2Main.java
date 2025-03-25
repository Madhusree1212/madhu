package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Vehicle2Config;
import com.fmc.Vehicle2;

public class Vehicle2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Vehicle2Config.class); 
		Vehicle2 v=context.getBean(Vehicle2.class);
		System.out.println("getting the values "+v.getName());
	}

}
