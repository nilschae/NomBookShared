package com.nilsschaefer.nombook.server.messages.support;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class MarkNotificationReadMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String notificationId;

    public MarkNotificationReadMessage(String from, String notificationId) {
        super(from, MessageType.MARK_NOTIFICATION_READ);
        this.notificationId = notificationId;
    }

    public String getNotificationId() { return notificationId; }
}
