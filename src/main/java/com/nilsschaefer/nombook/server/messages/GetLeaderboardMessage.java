package com.nilsschaefer.nombook.server.messages;

public class GetLeaderboardMessage extends Message {
    private final boolean global;

    public GetLeaderboardMessage(String sender) {
        this(sender, false);
    }

    public GetLeaderboardMessage(String sender, boolean global) {
        super(sender, MessageType.GET_LEADERBOARD);
        this.global = global;
    }

    public boolean isGlobal() {
        return global;
    }
}
