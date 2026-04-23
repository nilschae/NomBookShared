package com.nilsschaefer.nombook.server.messages;

public class ConnectMessage extends Message{
	private static final long serialVersionUID = 1L;
	private final String groupName;

    public ConnectMessage(String from) {
		this(from, null);
	}

	public ConnectMessage(String from, String groupName) {
		super(from, MessageType.CONNECT);
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}
}
