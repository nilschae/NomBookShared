package com.nilsschaefer.nombook.server.messages;

public class GetUserInfoMessage extends Message {
    private static final long serialVersionUID = 1L;
    private final String userId;

    public GetUserInfoMessage(String from, String userId) {
        super(from, MessageType.GET_USER_INFO);
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
