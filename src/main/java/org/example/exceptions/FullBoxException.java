package org.example.exceptions;

public class FullBoxException extends Exception{
    private final static String message = "The box is Full! R2D2 stop push the any fruits in box!";
    public FullBoxException() {
        System.out.println(message);
    }

    public FullBoxException(String message) {
        super(message);
    }

    public FullBoxException(String message, Throwable cause) {
        super(message, cause);
    }

    public FullBoxException(Throwable cause) {
        super(cause);
    }

    public FullBoxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
