package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.config.PlatformConfig;
import com.fmc.elearningplatform.ELearningPlatform;

public class ElearningPlatformMain {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(PlatformConfig.class);
		ELearningPlatform e=context.getBean(ELearningPlatform.class);
		e.start();
		e.stop();
		System.out.println(e.calculateCompletionPercentage(2, 10));
	
	}
}
