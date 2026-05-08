package com.nilsschaefer.nombook.server.messages.group;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

import java.io.Serializable;

public class GetGroupMembersMessage extends Message {
    public GetGroupMembersMessage(String from) {
        super(from, MessageType.GET_GROUP_MEMBERS);
    }
}
