package com.nilsschaefer.nombook.server.messages;

public class SetNewPasswordMessage extends Message {
    private final String token;
    private final String newPassword;

    public SetNewPasswordMessage(String token, String newPassword) {
        super("client", MessageType.SET_NEW_PASSWORD);
        this.token = token;
        this.newPassword = newPassword;
    }

    public String getToken() {
        return token;
    }

    public String getNewPassword() {
        return newPassword;
    }
}
