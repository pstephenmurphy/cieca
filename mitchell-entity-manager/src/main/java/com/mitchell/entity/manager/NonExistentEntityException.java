package com.mitchell.entity.manager;

public class NonExistentEntityException extends Exception {

    private static final long serialVersionUID = 3727938573780049485L;

    public NonExistentEntityException() {
        super();
    }

    public NonExistentEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonExistentEntityException(String message) {
        super(message);
    }

    public NonExistentEntityException(Throwable cause) {
        super(cause);
    }
}
