package com.data_jpa.spring_data_jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Product("Biscuit",10.00,"cream"));
		repo.save(new Product("cholates",20.00,"black"));
		repo.save(new Product("Jeans",500.00,"blue"));
		repo.save(new Product("shirts",800.00,"pink"));
		
		// find-->2.1 method
		
		  Optional<Product>p=repo.findById(2); if(p.isPresent()) {
		  System.out.println(p.get()); }else { System.out.println("No Data Found"); }
		  
		  
		  //2.2 method repo.findAll().forEach(System.out::println);
		 
		
		  //3.Delete-->3.1 Delete by specific id repo.deleteById(2); 
		  //3.2 Delete all rows one by one in (sequence order) 
		  repo.deleteAll(); 
		  //3.3 Delete all rows in batch (single query fired) 
		  repo.deleteAllInBatch();
		 
	}

}
