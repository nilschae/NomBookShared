package com.nilsschaefer.nombook.server.messages;

public class RemoveFromPlannerMessage extends Message {
    private String plannerId;

    public RemoveFromPlannerMessage(String sender, String plannerId) {
        super(sender, MessageType.REMOVE_FROM_PLANNER);
        this.plannerId = plannerId;
    }

    public String getPlannerId() { return plannerId; }
}
