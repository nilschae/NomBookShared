package com.nilsschaefer.nombook.server.messages;

public class InvitationResultMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final boolean successful;
    private final String invitationUuid;
    private final String reason;

    public InvitationResultMessage(String from, boolean successful, String reason, String invitationUuid) {
        super(from, MessageType.INVITATION_RESULT);
        this.successful = successful;
        this.reason = reason;
        this.invitationUuid = invitationUuid;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getInvitationUuid() {
        return invitationUuid;
    }

    public String getReason() {
        return reason;
    }
}
