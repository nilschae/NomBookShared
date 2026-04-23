package com.nilsschaefer.nombook.server.messages;

public class MoveRecipeMessage extends Message {
    private final String recipeId;
    private final String targetCookbookId;

    public MoveRecipeMessage(String from, String recipeId, String targetCookbookId) {
        super(from, MessageType.MOVE_RECIPE);
        this.recipeId = recipeId;
        this.targetCookbookId = targetCookbookId;
    }

    public String getRecipeId() { return recipeId; }
    public String getTargetCookbookId() { return targetCookbookId; }
}
