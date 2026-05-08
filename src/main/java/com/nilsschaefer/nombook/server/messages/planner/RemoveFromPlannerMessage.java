package com.nilsschaefer.nombook.server.messages.planner;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class RemoveFromPlannerMessage extends Message {
    private String plannerId;

    public RemoveFromPlannerMessage(String sender, String plannerId) {
        super(sender, MessageType.REMOVE_FROM_PLANNER);
        this.plannerId = plannerId;
    }

    public String getPlannerId() { return plannerId; }
}
