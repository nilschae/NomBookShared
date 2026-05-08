package com.nilsschaefer.nombook.server.messages.nutrition;

import com.nilsschaefer.nombook.server.messages.Message;
import com.nilsschaefer.nombook.server.messages.MessageType;

public class NutritionResultMessage extends Message {
    private static final long serialVersionUID = 1L;
    private final String nutritionJson;
    private final String notFoundIngredientsJson;

    public NutritionResultMessage(String from, String nutritionJson, String notFoundIngredientsJson) {
        super(from, MessageType.NUTRITION_RESULT);
        this.nutritionJson = nutritionJson;
        this.notFoundIngredientsJson = notFoundIngredientsJson;
    }

    public String getNutritionJson() {
        return nutritionJson;
    }

    public String getNotFoundIngredientsJson() {
        return notFoundIngredientsJson;
    }
}
