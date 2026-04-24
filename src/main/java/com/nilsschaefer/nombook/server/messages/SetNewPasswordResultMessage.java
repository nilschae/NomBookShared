package com.nilsschaefer.nombook.server.messages;

public class SetNewPasswordResultMessage extends Message {
    private final boolean success;
    private final String message;

    public SetNewPasswordResultMessage(boolean success, String message) {
        super("server", MessageType.SET_NEW_PASSWORD_RESULT);
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
