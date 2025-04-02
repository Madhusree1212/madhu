package com.fmc.interfaces;

import org.springframework.stereotype.Component;

@Component
public class InteractiveQuiz implements LearningMode{
	private int totalLessons=10;
	public void startSession() {
		System.out.println("InteractiveSession has started");
	}

	public void endSession() {
		System.out.println("InteractiveSession has stopped");
		
	}

	public double calculateCompletionPercentage(int lessonCompleted, int totalLessons) {
        return (lessonCompleted / (double) totalLessons) * 100;
	}
}
