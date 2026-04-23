package com.nilsschaefer.nombook.server.messages;

public class AddEntryMessage extends Message {
    private static final long serialVersionUID = 1L;
    private final String entryJsonString;

    public AddEntryMessage(String from, String entryJsonString) {
        super(from, MessageType.ADD_ENTRY);
        this.entryJsonString = entryJsonString;
    }

    public String getEntryJsonString()
    {
        return this.entryJsonString;
    }
    
}
