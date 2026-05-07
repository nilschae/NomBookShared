package com.nilsschaefer.nombook.server.messages;

public class AiStatsRequestMessage extends Message {
    public AiStatsRequestMessage(String sender) {
        super(sender, MessageType.AI_STATS_REQUEST);
    }
}
