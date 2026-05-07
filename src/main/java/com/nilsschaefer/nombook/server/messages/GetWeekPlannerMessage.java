package com.nilsschaefer.nombook.server.messages;

public class GetWeekPlannerMessage extends Message {
    public GetWeekPlannerMessage(String sender) {
        super(sender, MessageType.GET_WEEK_PLANNER);
    }
}
