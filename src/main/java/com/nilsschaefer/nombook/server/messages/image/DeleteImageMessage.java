package com.nilsschaefer.nombook.server.messages.image;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class DeleteImageMessage extends Message{
    private static final long serialVersionUID = 1L;
    final String filename;
    public DeleteImageMessage(String from, String filename) {
        super(from, MessageType.DELETE_IMAGE);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
}
