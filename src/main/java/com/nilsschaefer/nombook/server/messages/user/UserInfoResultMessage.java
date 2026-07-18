package com.nilsschaefer.nombook.server.messages.user;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class UserInfoResultMessage extends Message {
    private static final long serialVersionUID = 1L;
    private final String userId;
    private final String username;

    private final String userRank;
    private final int tokensBalance;
    private final java.util.List<String> purchasedProductIds;
    private final String activeTheme;

    public UserInfoResultMessage(String from, String userId, String username, String userRank, int tokensBalance, java.util.List<String> purchasedProductIds, String activeTheme) {
        super(from, MessageType.USER_INFO_RESULT);
        this.userId = userId;
        this.username = username;
        this.userRank = userRank;
        this.tokensBalance = tokensBalance;
        this.purchasedProductIds = purchasedProductIds;
        this.activeTheme = activeTheme;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getUserRank() {
        return userRank != null ? userRank : "USER";
    }

    public int getTokensBalance() {
        return tokensBalance;
    }

    public java.util.List<String> getPurchasedProductIds() {
        return purchasedProductIds;
    }

    public String getActiveTheme() {
        return activeTheme != null ? activeTheme : "STANDARD";
    }
}
