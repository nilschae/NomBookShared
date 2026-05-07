package com.nilsschaefer.nombook.server.messages;

public class AiGetContextRequestMessage extends Message {
    public AiGetContextRequestMessage() {
        super("server", MessageType.AI_GET_CONTEXT_REQUEST);
    }
}
