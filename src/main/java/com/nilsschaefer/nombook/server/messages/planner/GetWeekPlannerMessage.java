package com.nilsschaefer.nombook.server.messages.planner;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class GetWeekPlannerMessage extends Message {
    public GetWeekPlannerMessage(String sender) {
        super(sender, MessageType.GET_WEEK_PLANNER);
    }
}
