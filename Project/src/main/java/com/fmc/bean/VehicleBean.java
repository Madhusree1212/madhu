package com.fmc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class VehicleBean {
    private final VehicleService vehicleService;
	@Autowired
	 public VehicleBean(VehicleService vehicleService) {
	        this.vehicleService = vehicleService;
	    }
	 
	public void start() {
		vehicleService.music();
		vehicleService.move();
		
	}

}
