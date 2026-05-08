package com.nilsschaefer.nombook.server.messages.ai;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class AiChatStatusMessage extends Message {
    private String status;

    public AiChatStatusMessage(String from, String status) {
        super(from, MessageType.AI_CHAT_STATUS);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
