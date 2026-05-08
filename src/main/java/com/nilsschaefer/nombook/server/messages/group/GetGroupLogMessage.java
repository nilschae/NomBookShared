package com.nilsschaefer.nombook.server.messages.group;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class GetGroupLogMessage extends Message {
    public GetGroupLogMessage(String from) {
        super(from, MessageType.GET_GROUP_LOG);
    }
}
