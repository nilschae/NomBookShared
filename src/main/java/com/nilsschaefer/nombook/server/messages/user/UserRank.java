package com.nilsschaefer.nombook.server.messages.user;

public enum UserRank {
    USER(1),
    PREMIUM(2),
    TESTER(3);

    private final int level;

    UserRank(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public boolean covers(UserRank other) {
        return this.level >= other.level;
    }
}
