package com.nilsschaefer.nombook.server.messages;

public class AddTagMessage extends Message{
    private static final long serialVersionUID = 1L;
    final String tagName;
    public AddTagMessage( String from, String tagName) {
        super(from, MessageType.ADD_TAG);
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }
}
