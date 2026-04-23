package com.nilsschaefer.nombook.server.messages;

import java.io.Serializable;

public class GetGroupMembersMessage extends Message {
    public GetGroupMembersMessage(String from) {
        super(from, MessageType.GET_GROUP_MEMBERS);
    }
}
