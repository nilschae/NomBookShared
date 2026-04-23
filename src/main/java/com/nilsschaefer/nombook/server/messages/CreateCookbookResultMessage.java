package com.nilsschaefer.nombook.server.messages;

public class CreateCookbookResultMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final boolean success;
    private final String cookbookId;
    private final String cookbookName;

    public CreateCookbookResultMessage(String from, boolean success, String cookbookId, String cookbookName) {
        super(from, MessageType.CREATE_COOKBOOK_RESULT);
        this.success = success;
        this.cookbookId = cookbookId;
        this.cookbookName = cookbookName;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getCookbookId() {
        return cookbookId;
    }

    public String getCookbookName() {
        return cookbookName;
    }
}
