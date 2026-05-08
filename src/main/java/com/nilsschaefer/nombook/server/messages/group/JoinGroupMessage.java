package com.nilsschaefer.nombook.server.messages.group;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

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