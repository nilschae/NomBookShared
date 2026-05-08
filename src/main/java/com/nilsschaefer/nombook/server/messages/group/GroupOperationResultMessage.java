package com.nilsschaefer.nombook.server.messages.group;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class GroupOperationResultMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final boolean successful;
    private final String reason;
    private final String groupName;
    private final String groupUuid;
    private final String cookbookUuid;

    public GroupOperationResultMessage(String from, boolean successful, String reason, String groupName) {
        this(from, successful, reason, groupName, null, null);
    }

    public GroupOperationResultMessage(String from, boolean successful, String reason, String groupName, String groupUuid, String cookbookUuid) {
        super(from, MessageType.GROUP_OPERATION_RESULT);
        this.successful = successful;
        this.reason = reason;
        this.groupName = groupName;
        this.groupUuid = groupUuid;
        this.cookbookUuid = cookbookUuid;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getReason() {
        return reason;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupUuid() {
        return groupUuid;
    }

    public String getCookbookUuid() {
        return cookbookUuid;
    }
}