package com.nilsschaefer.nombook.server.messages;

public class ApplyRecipeShareMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String shareToken;

    public ApplyRecipeShareMessage(String from, String shareToken) {
        super(from, MessageType.APPLY_RECIPE_SHARE);
        this.shareToken = shareToken;
    }

    public String getShareToken() {
        return shareToken;
    }
}
