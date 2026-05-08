package com.nilsschaefer.nombook.server.messages.auth;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class LoginMessage extends Message {
    private static final long serialVersionUID = 3L;

    private final String email;
    private final String passwordHash;
    private final String requestedCookbookId;
    private final boolean googleLogin;

    public LoginMessage(String from, String email, String passwordHash) {
        this(from, email, passwordHash, null, false);
    }

    public LoginMessage(String from, String email, String passwordHash, String requestedCookbookId) {
        this(from, email, passwordHash, requestedCookbookId, false);
    }

    public LoginMessage(String from, String email, String passwordHash, String requestedCookbookId, boolean googleLogin) {
        super(from, MessageType.LOGIN);
        this.email = email;
        this.passwordHash = passwordHash;
        this.requestedCookbookId = requestedCookbookId;
        this.googleLogin = googleLogin;
    }

    public String getRequestedCookbookId() {
        return requestedCookbookId;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public boolean isGoogleLogin() {
        return googleLogin;
    }
}