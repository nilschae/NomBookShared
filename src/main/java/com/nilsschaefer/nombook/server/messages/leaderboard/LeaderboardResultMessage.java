package com.nilsschaefer.nombook.server.messages.leaderboard;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

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
