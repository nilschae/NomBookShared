package com.nilsschaefer.nombook.server.messages;

public class AiChatResponseMessage extends Message {
    private String text;
    private String recipeJson;

    public AiChatResponseMessage(String from, String text, String recipeJson) {
        super(from, MessageType.AI_CHAT_RESPONSE);
        this.text = text;
        this.recipeJson = recipeJson;
    }

    public String getText() {
        return text;
    }

    public String getRecipeJson() {
        return recipeJson;
    }
}
