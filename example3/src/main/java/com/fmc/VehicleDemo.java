package com.fmc;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component

public class VehicleDemo {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@PostConstruct
    public void init() {
        System.out.println("Database connection established.");
        this.name="siri";
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Database connection closed.");
    }
	@Override
	public String toString() {
		return "VehicleDemo [name=" + name + "]";
	}

	public VehicleDemo() { 
		super();
		// TODO Auto-generated constructor stub
	}
	
}
