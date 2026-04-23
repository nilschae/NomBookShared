package com.nilsschaefer.nombook.server.messages;

public class SynchronizeWasteBinMessage extends Message{
    private static final long serialVersionUID = 1L;
    final String wasteBinJson;
    public SynchronizeWasteBinMessage(String from, String wasteBinJson) {
        super(from, MessageType.SYNCHRONIZE_WASTE_BIN);
        this.wasteBinJson = wasteBinJson;
    }

    public String getWasteBinJson() {
        return wasteBinJson;
    }
}
