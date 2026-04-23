package com.nilsschaefer.nombook.server.messages;

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