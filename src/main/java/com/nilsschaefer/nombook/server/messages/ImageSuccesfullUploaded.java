package com.nilsschaefer.nombook.server.messages;


public class ImageSuccesfullUploaded extends Message {
    private static final long serialVersionUID = 1L;
    String filename;

    public ImageSuccesfullUploaded(String from, String filename) {
        super(from, MessageType.IMAGE_SUCCESFUL_UPLOADED);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
}
