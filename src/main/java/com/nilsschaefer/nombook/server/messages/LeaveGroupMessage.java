package com.nilsschaefer.nombook.server.messages;

public class LeaveGroupMessage extends Message {
    private static final long serialVersionUID = 1L;

    public LeaveGroupMessage(String from) {
        super(from, MessageType.LEAVE_GROUP);
    }
}
