package com.nilsschaefer.nombook.server.messages;

import java.util.List;

public class GroupLogResultMessage extends Message {
    private List<String> logs;

    public GroupLogResultMessage(String from, List<String> logs) {
        super(from, MessageType.GROUP_LOG_RESULT);
        this.logs = logs;
    }

    public List<String> getLogs() {
        return logs;
    }
}
