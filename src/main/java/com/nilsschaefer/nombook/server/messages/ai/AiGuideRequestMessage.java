package com.nilsschaefer.nombook.server.messages.ai;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

import java.util.List;

public class AiGuideRequestMessage extends Message {
    private String text;
    private String conversationId;
    private String replaceNotificationId;

    public AiGuideRequestMessage() {
        super(null, MessageType.AI_GUIDE_REQUEST);
    }

    public AiGuideRequestMessage(String from, String text, String conversationId) {
        this(from, text, conversationId, null);
    }

    public AiGuideRequestMessage(String from, String text, String conversationId, String replaceNotificationId) {
        super(from, MessageType.AI_GUIDE_REQUEST);
        this.text = text;
        this.conversationId = conversationId;
        this.replaceNotificationId = replaceNotificationId;
    }

    public String getText() {
        return text;
    }

    public String getConversationId() {
        return conversationId;
    }

    public String getReplaceNotificationId() {
        return replaceNotificationId;
    }
}
