package com.nilsschaefer.nombook.server.messages;

public class GetGroupLogMessage extends Message {
    public GetGroupLogMessage(String from) {
        super(from, MessageType.GET_GROUP_LOG);
    }
}
