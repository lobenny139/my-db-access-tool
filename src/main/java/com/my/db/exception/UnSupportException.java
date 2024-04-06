package com.my.db.exception;

public class UnSupportException extends RuntimeException{

    public UnSupportException() {
        super("Method Not Allowed");
    }

    public UnSupportException(String message) {
        super(message);
    }
}
