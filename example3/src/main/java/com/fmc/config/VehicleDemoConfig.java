package com.fmc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/* 3 ways we can declare @ComponentScant but recommended is 1st one*/
//@ComponentScan("com.fmc") 
//@ComponentScan(basePackages="com.fmc")
@ComponentScan(basePackageClasses= {com.fmc.VehicleDemo.class})
public class VehicleDemoConfig {
	
	

}
