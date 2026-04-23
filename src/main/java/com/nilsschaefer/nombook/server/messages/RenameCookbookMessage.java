package com.nilsschaefer.nombook.server.messages;

public class RenameCookbookMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String cookbookId;
    private final String newName;

    public RenameCookbookMessage(String from, String cookbookId, String newName) {
        super(from, MessageType.RENAME_COOKBOOK);
        this.cookbookId = cookbookId;
        this.newName = newName;
    }

    public String getCookbookId() {
        return cookbookId;
    }

    public String getNewName() {
        return newName;
    }
}
