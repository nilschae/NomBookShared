package com.nilsschaefer.nombook.server.messages.support;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class NotificationOperationResultMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final boolean success;
    private final String message;
    private final String notificationId;

    public NotificationOperationResultMessage(String from, boolean success, String message, String notificationId) {
        super(from, MessageType.NOTIFICATION_OPERATION_RESULT);
        this.success = success;
        this.message = message;
        this.notificationId = notificationId;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getNotificationId() {
        return notificationId;
    }
}
