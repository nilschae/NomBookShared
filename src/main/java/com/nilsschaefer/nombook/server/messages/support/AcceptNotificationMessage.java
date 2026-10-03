package com.nilsschaefer.nombook.server.messages.support;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class AcceptNotificationMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String notificationId;

    public AcceptNotificationMessage(String from, String notificationId) {
        super(from, MessageType.ACCEPT_NOTIFICATION);
        this.notificationId = notificationId;
    }

    public String getNotificationId() {
        return notificationId;
    }
}
