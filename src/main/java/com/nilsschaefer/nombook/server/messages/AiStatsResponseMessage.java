package com.nilsschaefer.nombook.server.messages;

public class AiStatsResponseMessage extends Message {
    private String statsJson;

    public AiStatsResponseMessage(String sender, String statsJson) {
        super(sender, MessageType.AI_STATS_RESPONSE);
        this.statsJson = statsJson;
    }

    public String getStatsJson() {
        return statsJson;
    }
}
