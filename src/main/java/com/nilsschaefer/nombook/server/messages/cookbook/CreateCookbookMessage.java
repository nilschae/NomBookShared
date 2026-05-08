package com.nilsschaefer.nombook.server.messages.cookbook;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class CreateCookbookMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String cookbookName;

    public CreateCookbookMessage(String from, String cookbookName) {
        super(from, MessageType.CREATE_COOKBOOK);
        this.cookbookName = cookbookName;
    }

    public String getCookbookName() {
        return cookbookName;
    }
}
