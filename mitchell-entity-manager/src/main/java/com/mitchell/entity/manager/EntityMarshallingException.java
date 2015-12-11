package com.mitchell.entity.manager;

public class EntityMarshallingException extends EntityManagerException {

    private static final long serialVersionUID = 6002679497916595431L;

    public EntityMarshallingException() {
    }

    public EntityMarshallingException(String message) {
        super(message);
    }

    public EntityMarshallingException(Throwable cause) {
        super(cause);
    }

    public EntityMarshallingException(String message, Throwable cause) {
        super(message, cause);
    }

}
