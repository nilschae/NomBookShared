package com.nilsschaefer.nombook.server.messages;

public class UpdateRatingMessage extends Message {
    private static final long serialVersionUID = 1L;
    final String recipeURL;
    final String username;
    final double newRating;

    public UpdateRatingMessage(String from, String recipeURL, String username, double newRating) {
        super(from, MessageType.UPDATE_RATING);
        this.recipeURL = recipeURL;
        this.username = username;
        this.newRating = newRating;
    }

    public String getRecipeURL()
    {
        return recipeURL;
    }

    public String getUsername() {
        return username;
    }

    public double getNewRating() {
        return newRating;
    }
}
