package com.nilsschaefer.nombook.server.messages;

public class AddImageMessage extends Message{
    private static final long serialVersionUID = 1L;
    final String imageBytes64Encoded;
    final String filename;
    public AddImageMessage(String from, String imageBytes64Encoded, String filename) {
        super(from, MessageType.ADD_IMAGE);
        this.imageBytes64Encoded = imageBytes64Encoded;
        this.filename = filename;
    }

    public String getImageBytes() {
        return imageBytes64Encoded;
    }

    public String getFilename() {
        return filename;
    }
}
