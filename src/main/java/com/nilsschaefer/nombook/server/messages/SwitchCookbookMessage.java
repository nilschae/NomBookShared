package com.nilsschaefer.nombook.server.messages;

public class SwitchCookbookMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String targetCookbookId;

    public SwitchCookbookMessage(String from, String targetCookbookId) {
        super(from, MessageType.SWITCH_COOKBOOK);
        this.targetCookbookId = targetCookbookId;
    }

    public String getTargetCookbookId() {
        return targetCookbookId;
    }
}
