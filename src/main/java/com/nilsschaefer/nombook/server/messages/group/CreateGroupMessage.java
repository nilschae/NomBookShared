package com.nilsschaefer.nombook.server.messages.group;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class CreateGroupMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String groupName;

    public CreateGroupMessage(String from, String groupName) {
        super(from, MessageType.CREATE_GROUP);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
}