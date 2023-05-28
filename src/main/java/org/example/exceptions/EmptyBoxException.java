package org.example.exceptions;

public class EmptyBoxException extends Exception{
    private final static String message = "The box is Empty! R2D2 where is my fruits?!";
    public EmptyBoxException() {
        System.out.println(message);
    }

    public EmptyBoxException(String message) {
        super(message);
    }

    public EmptyBoxException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyBoxException(Throwable cause) {
        super(cause);
    }

    public EmptyBoxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
