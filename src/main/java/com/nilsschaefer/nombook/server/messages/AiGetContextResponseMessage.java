package com.nilsschaefer.nombook.server.messages;

public class AiGetContextResponseMessage extends Message {
    private final String contextJson;

    public AiGetContextResponseMessage(String from, String contextJson) {
        super(from, MessageType.AI_GET_CONTEXT_RESPONSE);
        this.contextJson = contextJson;
    }

    public String getContextJson() {
        return contextJson;
    }
}
