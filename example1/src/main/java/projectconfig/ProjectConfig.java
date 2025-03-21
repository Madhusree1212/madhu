package projectconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fmc.Vehicle;

@Configuration
public class ProjectConfig {
	
	@Bean(name="audivehicle")
	@Primary
	Vehicle vehicle1() {
		Vehicle v=new Vehicle();
		v.setName("Audi");
		return v;	
	}
	
	@Bean
	
	String hello() {
		return "hello world";
	}
	@Bean
	Integer number(){
		return 16;
		}
}
