package com.nilsschaefer.nombook.server.messages.group;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;
import java.util.UUID;

public class ChangeRoleMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final UUID targetUserId;
    private final GroupRole newRole;

    public ChangeRoleMessage(String from, UUID targetUserId, GroupRole newRole) {
        super(from, MessageType.CHANGE_ROLE);
        this.targetUserId = targetUserId;
        this.newRole = newRole;
    }

    public UUID getTargetUserId() {
        return targetUserId;
    }

    public GroupRole getNewRole() {
        return newRole;
    }
}
