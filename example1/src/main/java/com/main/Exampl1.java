package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.Vehicle;

import projectconfig.ProjectConfig;

public class Exampl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vehicle =new Vehicle();
		vehicle.setName("Honda");
		System.out.println(vehicle);
		
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
	//Vehicle v=context.getBean("vehicle1",Vehicle.class);
	//Vehicle v=context.getBean("audivehicle",Vehicle.class);
	Vehicle v=context.getBean(Vehicle.class);
	System.out.println("vehicle name for spring context is : "+v.getName());
	}

}
