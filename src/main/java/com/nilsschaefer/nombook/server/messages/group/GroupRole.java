package com.nilsschaefer.nombook.server.messages.group;

public enum GroupRole {
    ADMIN,
    MODERATOR,
    USER,
    READER;

    public static GroupRole fromString(String roleStr) {
        if (roleStr == null) return USER;
        try {
            return valueOf(roleStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            return USER;
        }
    }
}
