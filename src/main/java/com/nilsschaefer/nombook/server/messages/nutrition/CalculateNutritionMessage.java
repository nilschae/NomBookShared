package com.nilsschaefer.nombook.server.messages.nutrition;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class CalculateNutritionMessage extends Message {
    private static final long serialVersionUID = 1L;
    private final String ingredientsJson;

    public CalculateNutritionMessage(String from, String ingredientsJson) {
        super(from, MessageType.CALCULATE_NUTRITION);
        this.ingredientsJson = ingredientsJson;
    }

    public String getIngredientsJson() {
        return ingredientsJson;
    }
}
