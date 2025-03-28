package com.fmc.material;

import org.springframework.stereotype.Component;

@Component("videomaterial")
public class Videomaterial implements Material {

	public void provideMaterial() {
		System.out.println("providing material in video format");
	}

}
