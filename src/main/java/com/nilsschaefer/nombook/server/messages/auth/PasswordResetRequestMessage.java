package com.nilsschaefer.nombook.server.messages.auth;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

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
