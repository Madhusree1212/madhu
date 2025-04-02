package com.fmc.interfaces;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Video implements LearningMode {
	private int totalLessons=10;

	public void startSession() {
		System.out.println("Video sesssion started");
	}

	public void endSession() {
		System.out.println("Video session stopped");	
	}

	public double calculateCompletionPercentage(int lessonCompleted, int totalLessons) {
        return (lessonCompleted / (double) totalLessons) * 100;
	}

}
