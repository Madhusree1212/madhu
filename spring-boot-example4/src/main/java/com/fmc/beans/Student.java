package com.fmc.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student  {
	/*
	 * @Autowired private Student stu;
	 */
	
	@Value("${stu.info.id}")
	private Integer id;
	
	@Value("${stu.info.name}")
	String name;
	
	@Value("${stu.info.surname}")
	List<String> surname;

	/*public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public List<String> getSurname() {
		return surname;
	}

	
	 * public Student() { super(); // TODO Auto-generated constructor stub }
	 

	public void setSurname(List<String> surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	
	public Student(Integer id, String name, List<String> surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;*/
	//}

	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
}

