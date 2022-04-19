package com.amazon.ata.music.playlist.service.exceptions;

public class InvalidAttributeChangeException extends InvalidAttributeException{
    private static final long serialVersionUID = 8007453316698012851L;

    public InvalidAttributeChangeException() {
    }

    public InvalidAttributeChangeException(String message) {
        super(message);
    }

    public InvalidAttributeChangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAttributeChangeException(Throwable cause) {
        super(cause);
    }

    public InvalidAttributeChangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
