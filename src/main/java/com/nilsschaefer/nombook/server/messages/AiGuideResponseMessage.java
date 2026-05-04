package com.nilsschaefer.nombook.server.messages;

public class AiGuideResponseMessage extends Message {
    private String text;
    private String commandsJson;

    public AiGuideResponseMessage(String from, String text, String commandsJson) {
        super(from, MessageType.AI_GUIDE_RESPONSE);
        this.text = text;
        this.commandsJson = commandsJson;
    }

    public String getText() {
        return text;
    }

    public String getCommandsJson() {
        return commandsJson;
    }
}
