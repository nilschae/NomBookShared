package com.nilsschaefer.nombook.server.messages.ai;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class AiGetContextRequestMessage extends Message {
    public AiGetContextRequestMessage() {
        super("server", MessageType.AI_GET_CONTEXT_REQUEST);
    }
}
