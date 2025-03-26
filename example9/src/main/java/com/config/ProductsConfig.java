package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fmc.Shop;

@Configuration
@ComponentScan("com.fmc")
public class ProductsConfig {
	@Bean(name="shop")
	public Shop shop() {
		Shop s=new Shop();
		s.setName("Dmart");
		return s;
		
	}
	@Bean
	public Shop shop1() {
		Shop shop1=new Shop();
		shop1.setName("relience");
		return shop1;
	}
	

	

}
