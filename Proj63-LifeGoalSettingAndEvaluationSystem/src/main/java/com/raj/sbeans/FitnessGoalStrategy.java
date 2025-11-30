package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fitness")
public class FitnessGoalStrategy implements GoalStrategy {

    @Value("${fitness.targetWeightLoss}")
    private double targetWeightLoss;

    @Value("${fitness.weeks}")
    private int weeks;

    @Value("${fitness.intensityLevel}")
    private String intensityLevel;

    @Override
    public String evaluateGoalProgress(GoalData data) {
        double progress = data.getWorkDone() / targetWeightLoss * 100;
        return String.format("Progress: %.0f%%\nKeep training at %s intensity!",
                progress, intensityLevel);
    }
}