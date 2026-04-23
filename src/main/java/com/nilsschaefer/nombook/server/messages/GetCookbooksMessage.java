package com.nilsschaefer.nombook.server.messages;

public class GetCookbooksMessage extends Message {
    private static final long serialVersionUID = 1L;

    public GetCookbooksMessage(String from) {
        super(from, MessageType.GET_COOKBOOKS);
    }
}
