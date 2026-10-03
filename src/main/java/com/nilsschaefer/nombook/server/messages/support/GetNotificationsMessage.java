package com.nilsschaefer.nombook.server.messages.support;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class GetNotificationsMessage extends Message {
    private static final long serialVersionUID = 1L;

    public GetNotificationsMessage(String from) {
        super(from, MessageType.GET_NOTIFICATIONS);
    }
}
