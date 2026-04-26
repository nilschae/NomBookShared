package com.nilsschaefer.nombook.server.messages;

public class DeleteAccountMessage extends Message {
    public DeleteAccountMessage(String from) {
        super(from, MessageType.DELETE_ACCOUNT);
    }
}
