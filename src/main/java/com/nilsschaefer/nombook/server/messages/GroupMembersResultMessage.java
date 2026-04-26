package com.nilsschaefer.nombook.server.messages;

import java.util.List;

public class GroupMembersResultMessage extends Message implements java.io.Serializable {
    private static final long serialVersionUID = -4380190844436983814L;
    private final List<MemberInfo> members;

    public GroupMembersResultMessage(String from, List<MemberInfo> members) {
        super(from, MessageType.GROUP_MEMBERS_RESULT);
        this.members = members;
    }

    public List<MemberInfo> getMembers() {
        return members;
    }
}