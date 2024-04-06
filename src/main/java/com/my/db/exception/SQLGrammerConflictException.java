package com.my.db.exception;

public class SQLGrammerConflictException extends RuntimeException {

    public SQLGrammerConflictException(){
        super("SQL Grammer conflict");
    }

    public SQLGrammerConflictException(String message){
        super(message);
    }

}