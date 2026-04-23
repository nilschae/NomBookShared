package com.nilsschaefer.nombook.server.messages;

public class RemoveFromWasteBinMessage extends Message{
    private static final long serialVersionUID = 1L;
    final String entry;
    public RemoveFromWasteBinMessage(String from, String entry) {
        super(from, MessageType.REMOVE_FROM_WASTE_BIN);
        this.entry = entry;
    }

    public String getEntry() {
        return entry;
    }
}
