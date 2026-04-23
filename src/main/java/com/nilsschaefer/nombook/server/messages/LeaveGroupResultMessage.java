package com.nilsschaefer.nombook.server.messages;

public class LeaveGroupResultMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final boolean wasLastMember;
    private final String invitationUuid;

    public LeaveGroupResultMessage(String from, boolean wasLastMember, String invitationUuid) {
        super(from, MessageType.LEAVE_GROUP_RESULT);
        this.wasLastMember = wasLastMember;
        this.invitationUuid = invitationUuid;
    }

    public boolean wasLastMember() {
        return wasLastMember;
    }

    public String getInvitationUuid() {
        return invitationUuid;
    }
}
