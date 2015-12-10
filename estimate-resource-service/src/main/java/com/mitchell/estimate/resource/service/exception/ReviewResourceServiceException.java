package com.mitchell.estimate.resource.service.exception;

import java.io.Serializable;

/**
 * The Class ReviewResourceServiceException.
 */
public class ReviewResourceServiceException extends Exception implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new review resource service exception.
     */
    public ReviewResourceServiceException() {
        super();
    }

    /**
     * Instantiates a new review resource service exception.
     *
     * @param message the message
     */
    public ReviewResourceServiceException(String message) {
        super(message);
    }

    /**
     * Instantiates a new review resource service exception.
     *
     * @param cause the cause
     */
    public ReviewResourceServiceException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new review resource service exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public ReviewResourceServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
