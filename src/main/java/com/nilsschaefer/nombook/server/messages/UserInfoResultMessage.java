package com.nilsschaefer.nombook.server.messages;

public class UserInfoResultMessage extends Message {
    private static final long serialVersionUID = 1L;
    private final String userId;
    private final String username;

    public UserInfoResultMessage(String from, String userId, String username) {
        super(from, MessageType.USER_INFO_RESULT);
        this.userId = userId;
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
}
