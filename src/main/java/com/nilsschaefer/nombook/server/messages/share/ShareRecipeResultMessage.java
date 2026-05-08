package com.nilsschaefer.nombook.server.messages.share;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class ShareRecipeResultMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final boolean successful;
    private final String shareToken;
    private final String reason;

    public ShareRecipeResultMessage(String from, boolean successful, String reason, String shareToken) {
        super(from, MessageType.SHARE_RECIPE_RESULT);
        this.successful = successful;
        this.reason = reason;
        this.shareToken = shareToken;
    }

    public boolean isSuccessful() { return successful; }
    public String getShareToken() { return shareToken; }
    public String getReason() { return reason; }
}
