package com.nilsschaefer.nombook.server.messages;

public class DeleteOwnRecipeMessage extends Message{
    final String recipeURL;
    public DeleteOwnRecipeMessage(String from, String recipeURL) {
        super(from, MessageType.DELETE_OWN_RECIPE);
        this.recipeURL = recipeURL;
    }

    public String getRecipeURL() {
        return recipeURL;
    }
}
