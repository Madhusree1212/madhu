package com.fmc.implementation;

import org.springframework.stereotype.Component;

@Component("bridgestone")
public class BridgeStoneTyres implements Tyres {
	
	public void rotate() {
		System.out.println("I am using BridheStone tyre");
		
	}
}