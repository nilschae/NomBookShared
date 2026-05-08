package com.nilsschaefer.nombook.server.messages.group;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class CreateInvitationMessage extends Message {
    private static final long serialVersionUID = 1L;

    public CreateInvitationMessage(String from) {
        super(from, MessageType.CREATE_INVITATION);
    }
}
