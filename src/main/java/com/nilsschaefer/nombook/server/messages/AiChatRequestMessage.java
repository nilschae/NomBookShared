package com.nilsschaefer.nombook.server.messages;

public class AiChatRequestMessage extends Message {
    private String text;

    public AiChatRequestMessage(String from, String text) {
        super(from, MessageType.AI_CHAT_REQUEST);
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
