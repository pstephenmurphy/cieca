package com.mitchell.estimate.resource.service.exception;

import java.io.Serializable;

public class ReviewResourceServiceException extends Exception implements Serializable {

    private static final long serialVersionUID = 1L;

    public ReviewResourceServiceException() {
        super();
    }

    public ReviewResourceServiceException(String message) {
        super(message);
    }

    public ReviewResourceServiceException(Throwable cause) {
        super(cause);
    }

    public ReviewResourceServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
