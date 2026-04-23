package com.nilsschaefer.nombook.server.messages;

public class JoinGroupMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String invitationLink;

    public JoinGroupMessage(String from, String invitationLink) {
        super(from, MessageType.JOIN_GROUP);
        this.invitationLink = invitationLink;
    }

    public String getInvitationLink() {
        return invitationLink;
    }
}