package com.nilsschaefer.nombook.server.messages.sync;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class UserStatusMessage extends Message {
    private String status; // e.g. "ONLINE", "OFFLINE", "COOKING"

    public UserStatusMessage(String from, String status) {
        super(from, MessageType.USER_STATUS);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
