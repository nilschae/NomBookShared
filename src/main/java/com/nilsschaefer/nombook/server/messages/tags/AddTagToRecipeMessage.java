package com.nilsschaefer.nombook.server.messages.tags;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class AddTagToRecipeMessage extends Message{
    private static final long serialVersionUID = 1L;
    final String recipeURL;
    final String tagToAdd;
    public AddTagToRecipeMessage(String from, String recipeURL, String tagToAdd) {
        super(from, MessageType.ADD_TAG_TO_RECIPE);
        this.recipeURL = recipeURL;
        this.tagToAdd = tagToAdd;
    }

    public String getRecipeURL() {
        return recipeURL;
    }

    public String getTagToAdd() {
        return tagToAdd;
    }
}
