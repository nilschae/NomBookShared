package com.nilsschaefer.nombook.server.messages.auth;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class RegisterMessage extends Message {
    private static final long serialVersionUID = 2L;

    private final String email;
    private final String passwordHash;
    private final String requestedCookbookId;

    public RegisterMessage(String from, String email, String passwordHash) {
        this(from, email, passwordHash, null);
    }

    public RegisterMessage(String from, String email, String passwordHash, String requestedCookbookId) {
        super(from, MessageType.REGISTER);
        this.email = email;
        this.passwordHash = passwordHash;
        this.requestedCookbookId = requestedCookbookId;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getRequestedCookbookId() {
        return requestedCookbookId;
    }
}