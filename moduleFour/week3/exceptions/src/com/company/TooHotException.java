package com.company;

public class TooHotException extends Exception{

    public TooHotException() {
    }

    public TooHotException(String message) {
        super(message);
    }
}
