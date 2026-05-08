package com.nilsschaefer.nombook.server.messages.cookbook;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class GetCookbooksResultMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String cookbooksJson;

    public GetCookbooksResultMessage(String from, String cookbooksJson) {
        super(from, MessageType.GET_COOKBOOKS_RESULT);
        this.cookbooksJson = cookbooksJson;
    }

    public String getCookbooksJson() {
        return cookbooksJson;
    }
}
