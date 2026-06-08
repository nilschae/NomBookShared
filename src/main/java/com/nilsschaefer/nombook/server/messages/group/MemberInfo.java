package com.nilsschaefer.nombook.server.messages.group;


import java.io.Serializable;
import java.util.UUID;

public class MemberInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private final UUID uuid;
    private final String username;
    private final String status;
    private final long lastSeen; // timestamp in millis
    private final GroupRole role;

    public MemberInfo(UUID uuid, String username, String status, long lastSeen) {
        this(uuid, username, status, lastSeen, GroupRole.USER);
    }

    public MemberInfo(UUID uuid, String username, String status, long lastSeen, GroupRole role) {
        this.uuid = uuid;
        this.username = username;
        this.status = status;
        this.lastSeen = lastSeen;
        this.role = role;
    }

    public UUID getUuid() { return uuid; }
    public String getUsername() { return username; }
    public String getStatus() { return status; }
    public long getLastSeen() { return lastSeen; }
    public GroupRole getRole() { return role; }
}
