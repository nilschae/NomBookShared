package com.nilsschaefer.nombook.server.messages;

public class CreateRecipeShareMessage extends Message {
    private static final long serialVersionUID = 1L;

    private final String recipeId;
    private final int durationDays;
    private final int durationHours;
    private final int maxUses;

    public CreateRecipeShareMessage(String from, String recipeId, int durationDays, int durationHours, int maxUses) {
        super(from, MessageType.SHARE_RECIPE);
        this.recipeId = recipeId;
        this.durationDays = durationDays;
        this.durationHours = durationHours;
        this.maxUses = maxUses;
    }

    public String getRecipeId() { return recipeId; }
    public int getDurationDays() { return durationDays; }
    public int getDurationHours() { return durationHours; }
    public int getMaxUses() { return maxUses; }
}
