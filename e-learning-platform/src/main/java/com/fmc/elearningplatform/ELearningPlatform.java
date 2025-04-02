package com.fmc.elearningplatform;

import org.springframework.stereotype.Component;
import com.fmc.interfaces.LearningMode;
import com.fmc.interfaces.Video;

@Component
public class ELearningPlatform {
	private LearningMode learningmode;
	
	public ELearningPlatform() {
		this.learningmode=new Video();
	}
	
	public ELearningPlatform(LearningMode learningmode) {
		this.learningmode=learningmode;
	}
	
	public void start() {
		learningmode.startSession();
	}
	
	public void stop() {
		learningmode.endSession();
	}
	
	public double calculateCompletionPercentage(int lessonCompleted, int totalLessons) {
        int totalLessons1 = 10; 
        return (lessonCompleted / (double) totalLessons1) * 100;
	}

	
}
