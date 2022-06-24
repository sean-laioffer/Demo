package com.example.demo.exception;

public class UserNotExistException extends RuntimeException {
    public UserNotExistException(String message) {
        super(message);
    }
}
