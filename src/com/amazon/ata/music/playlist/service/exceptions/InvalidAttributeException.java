package com.amazon.ata.music.playlist.service.exceptions;

public class InvalidAttributeException extends RuntimeException{
    public InvalidAttributeException() {
    }

    public InvalidAttributeException(String message) {
        super(message);
    }

    public InvalidAttributeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAttributeException(Throwable cause) {
        super(cause);
    }

    public InvalidAttributeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
