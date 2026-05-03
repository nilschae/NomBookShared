package com.nilsschaefer.nombook.server.messages;

public class AiChatRequestMessage extends Message {
    private String text;
    private String conversationId;

    public AiChatRequestMessage(String from, String text, String conversationId) {
        super(from, MessageType.AI_CHAT_REQUEST);
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
