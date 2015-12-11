package com.mitchell.entity.manager;

public class EntityManagerException extends Exception {

     private static final long serialVersionUID = 6039030547565091061L;

    public EntityManagerException() {
    }

    public EntityManagerException(String message) {
        super(message);
    }

    public EntityManagerException(Throwable cause) {
        super(cause);
    }

    public EntityManagerException(String message, Throwable cause) {
        super(message, cause);
    }

}
