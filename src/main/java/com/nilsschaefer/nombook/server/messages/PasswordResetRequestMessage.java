package com.nilsschaefer.nombook.server.messages;

public class PasswordResetRequestMessage extends Message {
    private final String email;

    public PasswordResetRequestMessage(String email) {
        super("client", MessageType.PASSWORD_RESET_REQUEST);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
