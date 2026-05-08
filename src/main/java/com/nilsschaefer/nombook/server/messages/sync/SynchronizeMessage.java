package com.nilsschaefer.nombook.server.messages.sync;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class SynchronizeMessage extends Message{
    private static final long serialVersionUID = 1L;
    private String jsonArrayString;

    public SynchronizeMessage(String from) {
        super(from, MessageType.SYNCHRONIZE);
    }

    public void addJsonArrayString(String jsonArrayString)
    {
        this.jsonArrayString = jsonArrayString;
    }

    public String getJsonArrayString()
    {
        return this.jsonArrayString;
    }
}

