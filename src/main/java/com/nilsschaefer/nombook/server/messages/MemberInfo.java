package com.nilsschaefer.nombook.server.messages;

import java.io.Serializable;
import java.util.UUID;

public class MemberInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private final UUID uuid;
    private final String username;
    private final String status;
    private final long lastSeen; // timestamp in millis

    public MemberInfo(UUID uuid, String username, String status, long lastSeen) {
        this.uuid = uuid;
        this.username = username;
        this.status = status;
        this.lastSeen = lastSeen;
    }

    public UUID getUuid() { return uuid; }
    public String getUsername() { return username; }
    public String getStatus() { return status; }
    public long getLastSeen() { return lastSeen; }
}
