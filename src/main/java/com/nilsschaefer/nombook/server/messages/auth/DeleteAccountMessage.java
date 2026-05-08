package com.nilsschaefer.nombook.server.messages.auth;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class DeleteAccountMessage extends Message {
    public DeleteAccountMessage(String from) {
        super(from, MessageType.DELETE_ACCOUNT);
    }
}
