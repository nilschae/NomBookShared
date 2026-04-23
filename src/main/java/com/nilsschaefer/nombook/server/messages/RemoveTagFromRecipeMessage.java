package com.nilsschaefer.nombook.server.messages;

public class RemoveTagFromRecipeMessage extends Message{
    private static final long serialVersionUID = 1L;
    final String recipeURL;
    final String tagToRemove;
    public RemoveTagFromRecipeMessage(String from, String recipeURL, String tagToRemove) {
        super(from, MessageType.REMOVE_TAG_FROM_RECIPE);
        this.recipeURL = recipeURL;
        this.tagToRemove = tagToRemove;
    }

    public String getRecipeURL() {
        return recipeURL;
    }

    public String getTagToRemove() {
        return tagToRemove;
    }
}
