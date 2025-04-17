package com.fmc.beans;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*//@ConfigurationProperties("emp.info")

//@Component
*/

@ConfigurationProperties("emp.info")
@Component
public class Employee  {
	
	/*
	 * @Autowired private Employee emp;
	 */
	
	/*
	 * @Value("${emp.info.id}") Integer id;
	 * 
	 * @Value("${emp.info.name}") String name;
	 * 
	 * @Value("${emp.info.surname}") List<String>surname;
	 * 
	 * @Value("${emp.info.address}") Map<String,Integer>address;
	 */
	
	private int id;
	private String name;
	private boolean type;
	private List<String> surname;
	private Map<String, Integer> address;
	
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", type=" + type + ", surname=" + surname + ", address="
				+ address + "]";
	}




	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public boolean isType() {
		return type;
	}




	public void setType(boolean type) {
		this.type = type;
	}




	public List<String> getSurname() {
		return surname;
	}




	public void setSurname(List<String> surname) {
		this.surname = surname;
	}




	public Map<String, Integer> getAddress() {
		return address;
	}




	public void setAddress(Map<String, Integer> address) {
		this.address = address;
	}




	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

}
