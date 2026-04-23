package com.nilsschaefer.nombook.server.messages;

public class AddToWasteBinMessage extends Message{
    private static final long serialVersionUID = 1L;
    final String jsonString;

    public AddToWasteBinMessage(String from, String jsonString) {
        super(from, MessageType.ADD_TO_WASTE_BIN);
        this.jsonString = jsonString;
    }

    public String getJsonString() {
        return jsonString;
    }
}
