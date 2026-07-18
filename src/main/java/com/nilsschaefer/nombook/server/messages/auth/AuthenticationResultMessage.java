package com.nilsschaefer.nombook.server.messages.auth;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

import java.util.List;

public class AuthenticationResultMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final boolean successful;
    private final AuthenticationResultReason reason;
    private final String username;
    private final String groupName;
    private final String userUuid;
    private final String groupUuid;
    private final String cookbookUuid;
    private final List<String> groupMemberUuids;
    private final String email;

    private final String userRank;
    private final int tokensBalance;
    private final List<String> purchasedProductIds;
    private final String activeTheme;

    public AuthenticationResultMessage(String from, boolean successful, AuthenticationResultReason reason) {
        this(from, successful, reason, null, null, null, null, null, null, null, "USER", 0, null, "STANDARD");
    }

    public AuthenticationResultMessage(String from, boolean successful, AuthenticationResultReason reason, String username, String groupName) {
        this(from, successful, reason, username, groupName, null, null, null, null, null, "USER", 0, null, "STANDARD");
    }

    public AuthenticationResultMessage(String from, boolean successful, AuthenticationResultReason reason, String username, String groupName, String userUuid, String groupUuid, String cookbookUuid, List<String> groupMemberUuids, String email, String userRank, int tokensBalance, List<String> purchasedProductIds, String activeTheme) {
        super(from, MessageType.AUTHENTICATION_RESULT);
        this.successful = successful;
        this.reason = reason;
        this.username = username;
        this.groupName = groupName;
        this.userUuid = userUuid;
        this.groupUuid = groupUuid;
        this.cookbookUuid = cookbookUuid;
        this.groupMemberUuids = groupMemberUuids;
        this.email = email;
        this.userRank = userRank;
        this.tokensBalance = tokensBalance;
        this.purchasedProductIds = purchasedProductIds;
        this.activeTheme = activeTheme;
    }
    
    public String getUserRank() {
        return userRank != null ? userRank : "USER";
    }

    public int getTokensBalance() {
        return tokensBalance;
    }

    public List<String> getPurchasedProductIds() {
        return purchasedProductIds;
    }

    public String getActiveTheme() {
        return activeTheme != null ? activeTheme : "STANDARD";
    }

    public List<String> getGroupMemberUuids() {
        return groupMemberUuids;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public AuthenticationResultReason getReason() {
        return reason;
    }

    public String getUsername() {
        return username;
    }

    public String getGroupName() {
        return groupName;
    }

    public boolean hasAssignedGroup() {
        return groupName != null && !groupName.trim().isEmpty();
    }

    public String getUserUuid() {
        return userUuid;
    }

    public String getGroupUuid() {
        return groupUuid;
    }

    public String getCookbookUuid() {
        return cookbookUuid;
    }

    public String getEmail() {
        return email;
    }
}