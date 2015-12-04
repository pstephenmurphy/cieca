package com.mitchell.entity.manager;

public class DuplicateEntityException extends Exception {

    private static final long serialVersionUID = -4514075919870007369L;

    public DuplicateEntityException() {
        super();
    }

    public DuplicateEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateEntityException(String message) {
        super(message);
    }

    public DuplicateEntityException(Throwable cause) {
        super(cause);
    }
}
