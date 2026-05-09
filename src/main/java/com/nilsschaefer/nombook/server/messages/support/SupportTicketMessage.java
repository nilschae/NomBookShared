package com.nilsschaefer.nombook.server.messages.support;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class SupportTicketMessage extends Message {
    private final String userMessage;
    private final String crashLog;
    private final String userUuid;
    private final String userName;
    private final String groupUuid;
    private final String groupName;
    private final String deviceModel;
    private final String androidVersion;

    public     SupportTicketMessage(String from, String userMessage, String crashLog, 
                               String userUuid, String userName, String groupUuid, String groupName,
                               String deviceModel, String androidVersion) {
    super(from, MessageType.SUPPORT_TICKET);
        this.userMessage = userMessage;
        this.crashLog = crashLog;
        this.userUuid = userUuid;
        this.userName = userName;
        this.groupUuid = groupUuid;
        this.groupName = groupName;
        this.deviceModel = deviceModel;
        this.androidVersion = androidVersion;
    }

    public String getUserMessage() { return userMessage; }
    public String getCrashLog() { return crashLog; }
    public String getUserUuid() { return userUuid; }
    public String getUserName() { return userName; }
    public String getGroupUuid() { return groupUuid; }
    public String getGroupName() { return groupName; }
    public String getDeviceModel() { return deviceModel; }
    public String getAndroidVersion() { return androidVersion; }
}