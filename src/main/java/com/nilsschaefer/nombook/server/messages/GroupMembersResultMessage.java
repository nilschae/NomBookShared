package com.nilsschaefer.nombook.server.messages;

import java.util.List;
import java.util.UUID;

public class GroupMembersResultMessage extends Message implements java.io.Serializable {
    private static final long serialVersionUID = -4380190844436983814L;
    private final List<UUID> memberUuids;

    public GroupMembersResultMessage(String from, List<UUID> memberUuids) {
        super(from, MessageType.GROUP_MEMBERS_RESULT);
        this.memberUuids = memberUuids;
    }

    public List<UUID> getMemberUuids() {
        return memberUuids;
    }

    // For compatibility with reflection-based code expecting getUserUuids()
    public List<UUID> getUserUuids() {
        return memberUuids;
    }
}