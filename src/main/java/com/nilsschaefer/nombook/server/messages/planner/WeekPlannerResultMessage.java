package com.nilsschaefer.nombook.server.messages.planner;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class WeekPlannerResultMessage extends Message {
    private String plannerJson;

    public WeekPlannerResultMessage(String sender, String plannerJson) {
        super(sender, MessageType.WEEK_PLANNER_RESULT);
        this.plannerJson = plannerJson;
    }

    public String getPlannerJson() { return plannerJson; }
}
