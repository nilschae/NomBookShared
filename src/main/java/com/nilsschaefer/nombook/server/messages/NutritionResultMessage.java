package com.nilsschaefer.nombook.server.messages;

public class NutritionResultMessage extends Message {
    private static final long serialVersionUID = 1L;
    private final String resultJson;
    private final String notFoundIngredientsJson;

    public NutritionResultMessage(String from, String resultJson, String notFoundIngredientsJson) {
        super(from, MessageType.NUTRITION_RESULT);
        this.resultJson = resultJson;
        this.notFoundIngredientsJson = notFoundIngredientsJson;
    }

    public String getResultJson() {
        return resultJson;
    }

    public String getNotFoundIngredientsJson() {
        return notFoundIngredientsJson;
    }
}
