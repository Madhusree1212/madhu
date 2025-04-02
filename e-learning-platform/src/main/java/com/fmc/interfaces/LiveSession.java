package com.fmc.interfaces;


public class LiveSession  implements LearningMode{
	private int totalLessons=10;

	public void startSession() {
		System.out.println("Live session has started");
	}

	public void endSession() {
		System.out.println("Live session has stopped");

	}

	public double calculateCompletionPercentage(int lessonCompleted, int totalLessons) {
        return (lessonCompleted / (double) totalLessons) * 100;
	}

}
