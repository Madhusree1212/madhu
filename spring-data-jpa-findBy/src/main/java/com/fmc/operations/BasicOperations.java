package com.fmc.operations;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fmc.beanclasses.Product;
import com.fmc.repository.ProductRepository;


@Component
public class BasicOperations implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// save method
		// 1.1.Method
		Product p1=new Product();
		p1.setProdCode("P1001");
		p1.setProdName("jeans");
		p1.setProdCost(500.00);
		
		Product p2=new Product();
		p2.setProdCode("P1002");
		p2.setProdName("shirts");
		p2.setProdCost(700.00);
		
		Product p3=new Product();
		p3.setProdCode("P1003");
		p3.setProdName("laptops");
		p3.setProdCost(40000.00);
		
		//repo.save(new Product("P1004","mobiles",20000.00));
		
		repo.save(p1);
		repo.save(p2);
		repo.save(p3);
		
		//repo.saveAll(Arrays.asList(p1,p2,p3));
		repo.findByProdIdOrProdCost(2, 500.00).forEach(System.out::println);
	}

}
