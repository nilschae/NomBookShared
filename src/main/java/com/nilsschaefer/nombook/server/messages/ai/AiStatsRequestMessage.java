package com.nilsschaefer.nombook.server.messages.ai;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class AiStatsRequestMessage extends Message {
    public AiStatsRequestMessage(String sender) {
        super(sender, MessageType.AI_STATS_REQUEST);
    }
}
