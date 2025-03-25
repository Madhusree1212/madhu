// has-a relationship

package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.TestConfig;
import com.fmc.Person;
import com.fmc.Vehicle5;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(TestConfig.class);
		Person person=context.getBean(Person.class);
		Vehicle5 vehicle=context.getBean(Vehicle5.class);
		System.out.println("person name : "+person.getName());
		System.out.println("Vehicle name: "+vehicle.getName());
		System.out.println("Person that uses Vehicle name: "+person.getVehicle());

		
	
	
	
	}

}
