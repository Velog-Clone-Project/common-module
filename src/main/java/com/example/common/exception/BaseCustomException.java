package com.example.common.exception;

public abstract class BaseCustomException extends RuntimeException {

    public BaseCustomException(String message) {
        super(message);
    }

    public abstract int getStatusCode();
}
