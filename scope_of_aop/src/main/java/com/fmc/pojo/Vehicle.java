package com.fmc.pojo;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope --> it will give different hashcode at a time  if we gave this annotation @Scope(BeanDefinition.SCOPE_PROTOTYPE)
// @Scope(BeanDefinition.SCOPE_PROTOTYPE)--> if we don't give means it will take singleton scope default but it will give same hashcode 
 // prototype will gave every time  a new code will give t
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Vehicle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle() {
		super();
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
	public void printHello() {
		System.out.println("hello");
	}
	

}
