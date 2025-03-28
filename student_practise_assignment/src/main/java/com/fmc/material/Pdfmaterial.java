package com.fmc.material;

import org.springframework.stereotype.Component;

@Component("pdfmaterial")
public class Pdfmaterial implements Material {

	public void provideMaterial() {
		System.out.println("Providing Material in pdf ");
	}

}
