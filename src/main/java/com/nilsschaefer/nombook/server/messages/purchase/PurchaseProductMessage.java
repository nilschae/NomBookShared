package com.nilsschaefer.nombook.server.messages.purchase;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class PurchaseProductMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String userId;
    private final String productId;
    private final String purchaseToken;

    public PurchaseProductMessage(String from, String userId, String productId, String purchaseToken) {
        super(from, MessageType.PURCHASE_PRODUCT);
        this.userId = userId;
        this.productId = productId;
        this.purchaseToken = purchaseToken;
    }

    public String getUserId() {
        return userId;
    }

    public String getProductId() {
        return productId;
    }

    public String getPurchaseToken() {
        return purchaseToken;
    }
}
