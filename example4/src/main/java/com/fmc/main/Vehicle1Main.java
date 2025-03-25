package com.fmc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.Vehicle1;
import com.fmc.config.Vehicle1Config;

public class Vehicle1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Vehicle1Config.class);
		Vehicle1 v=context.getBean(Vehicle1.class);
		System.out.println("geting the value "+v.getName());
		v.printHello();
	}

}
