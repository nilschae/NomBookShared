package com.nilsschaefer.nombook.server.messages.auth;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class PasswordResetResultMessage extends Message {
    private final boolean success;
    private final String message;

    public PasswordResetResultMessage(boolean success, String message) {
        super("server", MessageType.PASSWORD_RESET_RESULT);
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
