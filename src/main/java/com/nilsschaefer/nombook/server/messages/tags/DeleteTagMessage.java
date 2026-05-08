package com.nilsschaefer.nombook.server.messages.tags;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class DeleteTagMessage extends Message{
    private static final long serialVersionUID = 1L;
    final String tagName;
    public DeleteTagMessage(String from, String tagName) {
        super(from, MessageType.DELETE_TAG);
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }
}
