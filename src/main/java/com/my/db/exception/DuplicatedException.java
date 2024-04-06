package com.my.db.exception;

public class DuplicatedException extends RuntimeException {

    public DuplicatedException(){
        super("Entity duplicate");
    }

    public DuplicatedException(String message){
        super(message);
    }
}
