package com.nilsschaefer.nombook.server.messages;

public class AiGuideStatusMessage extends Message {
    private String status;

    public AiGuideStatusMessage(String from, String status) {
        super(from, MessageType.AI_GUIDE_STATUS);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
