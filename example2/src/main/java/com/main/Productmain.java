package com.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fum.Product;
import com.productconfig.ProductConfig;

public class Productmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p=new Product();
		p.setName("clothes");
		System.out.println(p);
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProductConfig.class);
        Product v = context.getBean("product2", Product.class);
		System.out.println("Getting the product name :"+v.getName());
	
	
	}

}
