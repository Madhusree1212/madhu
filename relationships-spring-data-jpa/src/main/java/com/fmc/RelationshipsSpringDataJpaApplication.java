package com.fmc;

 import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fmc.pojoclasses.Department;
import com.fmc.pojoclasses.Employee;
import com.fmc.repository.DepartmentRepository;

@SpringBootApplication
public class RelationshipsSpringDataJpaApplication implements CommandLineRunner {
	
	@Autowired
	private DepartmentRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(RelationshipsSpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Department sales=new Department();
		sales.setName("sales");
		

		Department it=new  Department();
		it.setName("IT");
		
		// create employees
		Employee emp1=new Employee();
		emp1.setName("Madhu");
		emp1.setDepartment(it);
		
		Employee emp2=new Employee();
		emp2.setName("Gayathri");
		emp2.setDepartment(sales);
		
		Employee emp3=new Employee();
		emp3.setName("Likith");
		emp3.setDepartment(it);
		
		Employee emp4=new Employee();
		emp4.setName("Lakshmi");
		emp4.setDepartment(sales);
		
		
		// set Employees to Departments
		sales.setEmployees(Arrays.asList(emp1,emp4));
		it.setEmployees(Arrays.asList(emp2,emp3));
		
		// save to Database
		repo.saveAll(Arrays.asList(sales,it));
		
		// deleting by id 
		repo.deleteById(1);
		
		// adding the values to department
		Department sales2=new Department();
		sales2.setName("sales2");
		repo.save(sales2);
		
		// adding the values to employees
		Employee emp5=new Employee();
		emp5.setName("Ravi");
		emp5.setDepartment(sales2);
		
		//setting sales2 to the values
		sales2.setEmployees(Arrays.asList(emp5));
		
		
		// saving to the database inserting to the after creation of sales2
		repo.saveAll(Arrays.asList(sales2));

		
		//to find all by using lazy fetch type
		repo.findAll();
		
		// to find find by id
		Optional<Department>d=repo.findById(2);
		if(d.isPresent()) {
			System.out.println("Department find by id: "+d.get().getName());
		}else {
			System.out.println("not found");
		}
		
	}
	

}
