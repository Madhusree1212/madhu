package com.fmc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.fmc.VehicleDemo;
import com.fmc.config.VehicleDemoConfig;

public class VehicleDemoMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(VehicleDemoConfig.class);
        VehicleDemo v = context.getBean(VehicleDemo.class);
        System.out.println("Vehicle name from Spring context is: " + v.getName());

         
    }
}
