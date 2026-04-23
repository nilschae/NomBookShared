package com.nilsschaefer.nombook.server.messages;

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
