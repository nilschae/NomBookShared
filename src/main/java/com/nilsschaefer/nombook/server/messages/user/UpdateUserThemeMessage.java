package com.nilsschaefer.nombook.server.messages.user;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class UpdateUserThemeMessage extends Message {
    private static final long serialVersionUID = 1L;
    private final String themeName;

    public UpdateUserThemeMessage(String from, String themeName) {
        super(from, MessageType.UPDATE_USER_THEME);
        this.themeName = themeName;
    }

    public String getThemeName() {
        return themeName;
    }
}
