package com.nilsschaefer.nombook.server.messages.cookbook;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class CreateCookbookResultMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final boolean success;
    private final String cookbookId;
    private final String cookbookName;
    private final String reason;

    public CreateCookbookResultMessage(String from, boolean success, String cookbookId, String cookbookName) {
        this(from, success, cookbookId, cookbookName, null);
    }

    public CreateCookbookResultMessage(String from, boolean success, String cookbookId, String cookbookName, String reason) {
        super(from, MessageType.CREATE_COOKBOOK_RESULT);
        this.success = success;
        this.cookbookId = cookbookId;
        this.cookbookName = cookbookName;
        this.reason = reason;
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

    public String getReason() {
        return reason;
    }
}
