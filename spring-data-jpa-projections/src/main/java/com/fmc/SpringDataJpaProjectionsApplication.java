package com.fmc;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fmc.beanclasses.ProductProjections;
import com.fmc.repository.ProductProjectionRepository;
import com.fmc.service.ProductService;

@SpringBootApplication
public class SpringDataJpaProjectionsApplication implements CommandLineRunner {
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaProjectionsApplication.class, args);
	}

	
	@Autowired
	private ProductProjectionRepository repo;
	
	@Autowired
	private ProductService pro;
	
	
	@Override
	public void run(String... args) throws Exception {
		ProductProjections p1=new ProductProjections();
		p1.setVendorCode("V1001");
		p1.setProdCost(500.00);
		
		ProductProjections p2=new ProductProjections();
		p2.setVendorCode("V1002");
		p2.setProdCost(700.00);
		
		ProductProjections p3=new ProductProjections();
		p3.setVendorCode("V1003");
		p3.setProdCost(850.00);
		
		// saving the data into repository
		repo.saveAll(Arrays.asList(p1,p2,p3));
		
		// fetching vendorCode and prodCost
		System.out.println("Fetching vender code and cost");
		List<ProductProjectionRepository.MyView>myView=pro.getVendorCodeAndCost("V1001");
			myView.forEach(view->
			System.out.println("VenderCode: "+view.getVendorCode()+" ProdCost: "+view.getProdCost())
			);
			
		// fetching prod id and prod cost
			System.out.println("Fetching prod id and cost");

			List<ProductProjectionRepository.MyViewTwo>myViewTwoList=pro.getProdIdAndCost("V1001");
			myViewTwoList.forEach(view1->
			System.out.println("ProdId: "+view1.getProdId()+" ProdCost: "+view1.getProdCost())
			);
	}
		
}

		
	


	


