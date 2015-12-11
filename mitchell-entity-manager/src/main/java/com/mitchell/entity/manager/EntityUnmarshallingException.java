package com.mitchell.entity.manager;

public class EntityUnmarshallingException extends EntityManagerException {

    private static final long serialVersionUID = 6002679497916595431L;

    public EntityUnmarshallingException() {
    }

    public EntityUnmarshallingException(String message) {
        super(message);
    }

    public EntityUnmarshallingException(Throwable cause) {
        super(cause);
    }

    public EntityUnmarshallingException(String message, Throwable cause) {
        super(message, cause);
    }

}
