package com.nilsschaefer.nombook.server.messages.ai;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

import java.util.List;

public class AiGuideRequestMessage extends Message {
    private String text;
    private String conversationId;

    public AiGuideRequestMessage(String from, String text, String conversationId) {
        super(from, MessageType.AI_GUIDE_REQUEST);
        this.text = text;
        this.conversationId = conversationId;
    }

    public String getText() {
        return text;
    }

    public String getConversationId() {
        return conversationId;
    }
}
