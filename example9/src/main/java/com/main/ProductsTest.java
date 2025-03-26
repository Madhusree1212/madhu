package com.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.ProductsConfig;
import com.fmc.Product1;
import com.fmc.Shop;

public class ProductsTest {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ProductsConfig.class);
		Product1 p1=context.getBean(Product1.class);
		//Shop s1=context.getBean("shop",Shop.class);
		
		System.out.println("Getting the beans : "+p1.getName());
		System.out.println(p1);
		
	//	System.out.println("Getting the Shop beans : "+s1.getName());*/
	}

}
