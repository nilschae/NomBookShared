package com.nilsschaefer.nombook.server.messages.support;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class UserNotificationMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String notificationId;
    private final String messageText;
    private final boolean isRead;
    private final long createdAt;

    public UserNotificationMessage(String from, String notificationId, String messageText, boolean isRead, long createdAt) {
        super(from, MessageType.USER_NOTIFICATION);
        this.notificationId = notificationId;
        this.messageText = messageText;
        this.isRead = isRead;
        this.createdAt = createdAt;
    }

    public String getNotificationId() { return notificationId; }
    public String getMessageText() { return messageText; }
    public boolean isRead() { return isRead; }
    public long getCreatedAt() { return createdAt; }
}
