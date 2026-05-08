package com.nilsschaefer.nombook.server.messages.sync;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class DisconnectMessage  extends Message{
    private static final long serialVersionUID = 1L;
    public DisconnectMessage(String from) {
        super(from, MessageType.DISCONNECT);
    }
    
}
