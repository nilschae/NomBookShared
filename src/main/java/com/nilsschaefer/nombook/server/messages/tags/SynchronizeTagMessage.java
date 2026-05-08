package com.nilsschaefer.nombook.server.messages.tags;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class SynchronizeTagMessage extends Message
{
    private static final long serialVersionUID = 1L;
    final String tagJsonArray;
    public SynchronizeTagMessage(String from, String tagJsonArray) {
        super(from, MessageType.SYNCHRONIZE_TAGS);
        this.tagJsonArray = tagJsonArray;
    }

    public String getTagJsonArray() {
        return tagJsonArray;
    }
}
