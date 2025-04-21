package com.fmc.basicoperation;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fmc.beanclasses.ProductQuery;
import com.fmc.repository.ProductRepository;

@Component
public class BasicOperationOfproduct implements CommandLineRunner{

	@Autowired 
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		ProductQuery p1=new ProductQuery();
		p1.setProd_Name("jeans");
		p1.setVendor_Code("V1001");
		p1.setProd_Code("101");
		p1.setProd_Cost(520.00);
		
		ProductQuery p2=new ProductQuery();
		p2.setVendor_Code("V1002");
		p2.setProd_Code("102");
		p2.setProd_Name("shirts");
		p2.setProd_Cost(750.00);
		
		// saving the values into repository
		repo.saveAll(Arrays.asList(p1,p2));
		
		System.out.println("Sample product data loaded into database");
		
		//repo.getAllProductData().forEach(System.out::println);
		repo.getAllProducts("V1001",520.00).forEach(System.out::println);
	}

}
