package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("skill")
public class SkillGoalStrategy implements GoalStrategy {

    @Value("${skill.targetHours}")
    private double targetHours;

    @Value("${skill.weeklyHoursPlanned}")
    private double weeklyHoursPlanned;

    @Value("${skill.skillName}")
    private String skillName;

    @Override
    public String evaluateGoalProgress(GoalData data) {
        double progress = data.getWorkDone() / targetHours * 100;
        return String.format("Progress: %.0f%%\nKeep practicing consistently!", progress);
    }
}
