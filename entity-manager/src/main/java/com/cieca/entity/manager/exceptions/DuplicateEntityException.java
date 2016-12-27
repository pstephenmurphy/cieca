package com.cieca.entity.manager.exceptions;

public class DuplicateEntityException extends EntityManagerException {

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
