package com.nilsschaefer.nombook.server.messages.ai;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class AiChatRequestMessage extends Message {
    private String text;
    private String conversationId;
    private java.util.List<String> existingTags;
    private String base64Image;

    public AiChatRequestMessage(String from, String text, String conversationId, java.util.List<String> existingTags, String base64Image) {
        super(from, MessageType.AI_CHAT_REQUEST);
        this.text = text;
        this.conversationId = conversationId;
        this.existingTags = existingTags;
        this.base64Image = base64Image;
    }

    public String getText() {
        return text;
    }

    public String getConversationId() {
        return conversationId;
    }

    public java.util.List<String> getExistingTags() {
        return existingTags;
    }

    public String getBase64Image() {
        return base64Image;
    }
}
