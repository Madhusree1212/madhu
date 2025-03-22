package com.productconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.fum.Product;

@Component // it will creates the beans
@ComponentScan(basePackages="com.fum") // it will scans all the beans present in the config
public class ProductConfig {
	
	@Bean
	Product product1() {
		Product p=new Product();
		p.setName("jeans");
		return p;
		
	}
	@Bean
	Product product2() {
		Product p1=new Product();
		p1.setName("shirts");
		return p1;
	}
	@Bean
	Product product3() {
		Product p2=new Product();
		p2.setName("bottles");
		return p2;
	}
	
	

}
