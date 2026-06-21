package com.nilsschaefer.nombook.server.messages.support;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class ReportRecipeMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String recipeJson;
    private final String category;
    private final String reason;

    public ReportRecipeMessage(String from, String recipeJson, String category, String reason) {
        super(from, MessageType.REPORT_RECIPE);
        this.recipeJson = recipeJson;
        this.category = category;
        this.reason = reason;
    }

    public String getRecipeJson() { return recipeJson; }
    public String getCategory() { return category; }
    public String getReason() { return reason; }
}
