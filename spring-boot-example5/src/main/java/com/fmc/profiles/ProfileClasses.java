package com.fmc.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component

public class ProfileClasses implements CommandLineRunner {
	@Value("${profile.id}")
	private Integer id;

	@Value("${profile.name}")
	private String name;

	@Value("${profile.surname}")
	private String surname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public ProfileClasses() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProfileClasses [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("----- Inside prod profile -----");
	    System.out.println("ID: " + id);
	    System.out.println("Name: " + name);
	    System.out.println("Surname: " + surname);
		
	}
	
}
