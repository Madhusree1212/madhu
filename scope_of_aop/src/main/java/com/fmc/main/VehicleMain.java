package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.config.VehicleConfig;
import com.fmc.pojo.Vehicle;

public class VehicleMain {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(VehicleConfig.class);
		Vehicle v=context.getBean(Vehicle.class);
		Vehicle v1=context.getBean(Vehicle.class);
		
		System.out.println("Hashcode: "+v.hashCode());
		System.out.println("Hashcode: "+v1.hashCode());
		System.out.println("Using Scope");

		v.printHello();
	
	
	}

}
