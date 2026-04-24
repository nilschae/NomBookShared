package com.nilsschaefer.nombook.server.messages;

public class ResendVerificationMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String email;

    public ResendVerificationMessage(String from, String email) {
        super(from, MessageType.RESEND_VERIFICATION_EMAIL);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
