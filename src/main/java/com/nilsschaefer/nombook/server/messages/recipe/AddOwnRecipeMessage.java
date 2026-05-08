package com.nilsschaefer.nombook.server.messages.recipe;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class AddOwnRecipeMessage extends Message{
    final String ownRecipe;
    public AddOwnRecipeMessage(String from, String ownRecipe) {
        super(from, MessageType.ADD_OWN_RECIPE);
        this.ownRecipe = ownRecipe;
    }

    public String getOwnRecipe() {
        return ownRecipe;
    }
}
