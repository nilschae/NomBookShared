package com.nilsschaefer.nombook.server.messages.group;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class LeaveGroupMessage extends Message {
    private static final long serialVersionUID = 1L;

    public LeaveGroupMessage(String from) {
        super(from, MessageType.LEAVE_GROUP);
    }
}
