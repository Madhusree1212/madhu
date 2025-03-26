package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.bean.Person;
import com.fmc.config.ProjectConfig;

public class ProjectMain {
	public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p=context.getBean(Person.class);
        System.out.println("Using Application ");
        p.use();
	}

}
