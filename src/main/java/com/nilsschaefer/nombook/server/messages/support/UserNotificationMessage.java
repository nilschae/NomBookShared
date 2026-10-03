package com.nilsschaefer.nombook.server.messages.support;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class UserNotificationMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String notificationId;
    private final String messageText;
    private final boolean isRead;
    private final long createdAt;
    private final String type;
    private final String payload;
    private final String status;

    public UserNotificationMessage(String from, String notificationId, String messageText, boolean isRead, long createdAt) {
        this(from, notificationId, messageText, isRead, createdAt, "GENERAL", null, "PENDING");
    }

    public UserNotificationMessage(String from, String notificationId, String messageText, boolean isRead, long createdAt,
                                   String type, String payload, String status) {
        super(from, MessageType.USER_NOTIFICATION);
        this.notificationId = notificationId;
        this.messageText = messageText;
        this.isRead = isRead;
        this.createdAt = createdAt;
        this.type = type != null ? type : "GENERAL";
        this.payload = payload;
        this.status = status != null ? status : "PENDING";
    }

    public String getNotificationId() { return notificationId; }
    public String getMessageText() { return messageText; }
    public boolean isRead() { return isRead; }
    public long getCreatedAt() { return createdAt; }
    public String getType() { return type != null ? type : "GENERAL"; }
    public String getPayload() { return payload; }
    public String getStatus() { return status != null ? status : "PENDING"; }
}
