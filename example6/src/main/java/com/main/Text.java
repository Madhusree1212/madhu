// register bean--> if we don't  want to use java,annotation ,xml configurations then we can use this register bean configuration


package com.main;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.fmc.Vehicle3;

public class Text {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext();
		Vehicle3 volva=new  Vehicle3();
		volva.setName("volva");
		Supplier<Vehicle3> v1=()->volva;
		Supplier<Vehicle3> v2=()->{
			Vehicle3 audi=new Vehicle3();
			audi.setName("Audi");
			return audi;
		};
		Random random =new Random();
		int randomnumber=random.nextInt(10);
		System.out.println("randomnumber: "+randomnumber);
		if((randomnumber % 2)==0) {
			System.out.println("from volva");
			((GenericApplicationContext)context).registerBean("volka"
					,Vehicle3.class,v1);
		}else {
			System.out.println("From audi");
			((GenericApplicationContext)context).registerBean("VolkaSupplier"
					,Vehicle3.class,v2);
		}
		/*Vehicle3 veh=context.getBean(Vehicle3.class);
		System.out.println(veh.getName());*/
	
	
	
	}

}
