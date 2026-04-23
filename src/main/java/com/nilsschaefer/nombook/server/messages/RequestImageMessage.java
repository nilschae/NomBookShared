package com.nilsschaefer.nombook.server.messages;

public class RequestImageMessage extends Message{
    final String imageURL;
    public RequestImageMessage(String from, String imageURL) {
        super(from, MessageType.REQUEST_IMAGE);
        this.imageURL = imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

}
