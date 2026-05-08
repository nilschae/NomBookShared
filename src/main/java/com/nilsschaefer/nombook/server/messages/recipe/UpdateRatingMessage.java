package com.nilsschaefer.nombook.server.messages.recipe;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class UpdateRatingMessage extends Message {
    private static final long serialVersionUID = 1L;
    final String recipeURL;
    final String username;
    final String userUUID;
    final double newRating;

    public UpdateRatingMessage(String from, String recipeURL, String username, String userUUID, double newRating) {
        super(from, MessageType.UPDATE_RATING);
        this.recipeURL = recipeURL;
        this.username = username;
        this.userUUID = userUUID;
        this.newRating = newRating;
    }

    public String getRecipeURL()
    {
        return recipeURL;
    }

    public String getUsername() {
        return username;
    }

    public String getUserUUID() {
        return userUUID;
    }

    public double getNewRating() {
        return newRating;
    }
}
