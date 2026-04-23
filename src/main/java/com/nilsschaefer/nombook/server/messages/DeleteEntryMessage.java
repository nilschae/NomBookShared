package com.nilsschaefer.nombook.server.messages;

public class DeleteEntryMessage extends Message {
    private static final long serialVersionUID = 2L;
    private final String entryJSONString;

    public DeleteEntryMessage(String from, String entryJSONString) {
        super(from, MessageType.DELETE_ENTRY);
        this.entryJSONString = entryJSONString;
    }

    public String getEntryJSONString()
    {
        return this.entryJSONString;
    }
    
}
