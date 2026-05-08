package com.nilsschaefer.nombook.server.messages.recipe;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class ClickOnRecipeMessage extends Message{
    private static final long serialVersionUID = 1L;
    final String recipeURL;
    public ClickOnRecipeMessage(String from, String recipeURL) {
        super(from, MessageType.CLICK_ON_RECIPE);
        this.recipeURL = recipeURL;
    }

    public String getRecipeURL() {
        return recipeURL;
    }
}
