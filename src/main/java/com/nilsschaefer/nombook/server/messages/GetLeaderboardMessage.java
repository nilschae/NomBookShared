package com.nilsschaefer.nombook.server.messages;

public class GetLeaderboardMessage extends Message {
    public GetLeaderboardMessage(String sender) {
        super(sender, MessageType.GET_LEADERBOARD);
    }
}
