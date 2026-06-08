package com.nilsschaefer.nombook.server.messages.group;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;
import java.util.UUID;

public class RemoveUserFromGroupMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final UUID targetUserId;

    public RemoveUserFromGroupMessage(String from, UUID targetUserId) {
        super(from, MessageType.REMOVE_USER_FROM_GROUP);
        this.targetUserId = targetUserId;
    }

    public UUID getTargetUserId() {
        return targetUserId;
    }
}
