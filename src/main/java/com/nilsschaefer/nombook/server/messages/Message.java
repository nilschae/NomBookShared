package com.nilsschaefer.nombook.server.messages;

import java.io.Serializable;

public abstract class Message implements Serializable{
	private static final long serialVersionUID = 1L;
    
    private final MessageType messageType;
	private final String from;

    public Message(String from, MessageType type) {
		this.messageType = type;
        this.from = from;
    }

	public MessageType getMessageType() {
		return this.messageType;
	}

	/** @noinspection unused*/
    public String getFrom() {
		return this.from;
	}

}
