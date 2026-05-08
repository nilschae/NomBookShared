package com.nilsschaefer.nombook.server.messages.planner;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class AddToPlannerMessage extends Message {
    private String recipeId;
    private String plannedDate;
    private String mealType;
    private String plannedTime; // Optional: "HH:mm"

    public AddToPlannerMessage(String sender, String recipeId, String plannedDate, String mealType) {
        this(sender, recipeId, plannedDate, mealType, null);
    }

    public AddToPlannerMessage(String sender, String recipeId, String plannedDate, String mealType, String plannedTime) {
        super(sender, MessageType.ADD_TO_PLANNER);
        this.recipeId = recipeId;
        this.plannedDate = plannedDate;
        this.mealType = mealType;
        this.plannedTime = plannedTime;
    }

    public String getRecipeId() { return recipeId; }
    public String getPlannedDate() { return plannedDate; }
    public String getMealType() { return mealType; }
    public String getPlannedTime() { return plannedTime; }
}
