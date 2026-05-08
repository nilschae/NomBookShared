package com.nilsschaefer.nombook.server.messages.cookbook;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class DeleteCookbookMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String cookbookId;

    public DeleteCookbookMessage(String from, String cookbookId) {
        super(from, MessageType.DELETE_COOKBOOK);
        this.cookbookId = cookbookId;
    }

    public String getCookbookId() {
        return cookbookId;
    }
}
