package com.nilsschaefer.nombook.server.messages;

public class PutImageToRecipeMessage extends Message{
    String recipe_url;
    String image_url;
    String image_type;
    private static final long serialVersionUID = 1L;
    public PutImageToRecipeMessage(String from, String recipe_url, String image_url, String image_type) {
        super(from, MessageType.PUT_IMAGE_TO_RECIPE);
        this.recipe_url = recipe_url;
        this.image_url = image_url;
        this.image_type = image_type;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getImage_type() {
        return image_type;
    }

    public String getRecipe_url() {
        return recipe_url;
    }
}
