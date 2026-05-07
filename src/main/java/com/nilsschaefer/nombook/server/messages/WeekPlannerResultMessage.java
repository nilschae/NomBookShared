package com.nilsschaefer.nombook.server.messages;

public class WeekPlannerResultMessage extends Message {
    private String plannerJson;

    public WeekPlannerResultMessage(String sender, String plannerJson) {
        super(sender, MessageType.WEEK_PLANNER_RESULT);
        this.plannerJson = plannerJson;
    }

    public String getPlannerJson() { return plannerJson; }
}
