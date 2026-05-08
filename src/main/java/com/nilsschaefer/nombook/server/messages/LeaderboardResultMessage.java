package com.nilsschaefer.nombook.server.messages;

public class LeaderboardResultMessage extends Message {
    private final String leaderboardJson;

    public LeaderboardResultMessage(String sender, String leaderboardJson) {
        super(sender, MessageType.LEADERBOARD_RESULT);
        this.leaderboardJson = leaderboardJson;
    }

    public String getLeaderboardJson() {
        return leaderboardJson;
    }
}
