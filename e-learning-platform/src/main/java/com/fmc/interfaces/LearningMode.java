package com.fmc.interfaces;

public interface LearningMode {
    void startSession();
    void endSession();
    double calculateCompletionPercentage(int lessonCompleted, int totalLessons); 
}
