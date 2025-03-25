package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fmc.Vehicle4;


public class Vehicle3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Vehicle4 vehicle=context.getBean("vehicle4",Vehicle4.class);
		System.out.println("Getting the bean values : "+vehicle.getName());
		

	}

}
