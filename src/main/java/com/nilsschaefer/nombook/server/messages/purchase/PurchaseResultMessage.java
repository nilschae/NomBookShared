package com.nilsschaefer.nombook.server.messages.purchase;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;
import java.util.List;

public class PurchaseResultMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final boolean successful;
    private final String reason;
    private final String productId;
    private final int tokensBalance;
    private final List<String> purchasedProductIds;

    public PurchaseResultMessage(String from, boolean successful, String reason, String productId, int tokensBalance, List<String> purchasedProductIds) {
        super(from, MessageType.PURCHASE_RESULT);
        this.successful = successful;
        this.reason = reason;
        this.productId = productId;
        this.tokensBalance = tokensBalance;
        this.purchasedProductIds = purchasedProductIds;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getReason() {
        return reason;
    }

    public String getProductId() {
        return productId;
    }

    public int getTokensBalance() {
        return tokensBalance;
    }

    public List<String> getPurchasedProductIds() {
        return purchasedProductIds;
    }
}
