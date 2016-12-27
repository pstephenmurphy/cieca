package com.cieca.estimate.resource.service.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * The Class ReviewResourceServiceErrorHandler.
 */
@Provider
public final class ReviewResourceServiceErrorHandler implements ExceptionMapper<ReviewResourceServiceException> {

    /**
     * Instantiates a new review resource service error handler.
     */
    public ReviewResourceServiceErrorHandler() {
    }

    /* (non-Javadoc)
     * @see javax.ws.rs.ext.ExceptionMapper#toResponse(java.lang.Throwable)
     */
    @Override
    public Response toResponse(final ReviewResourceServiceException exception) {
        return Response.status(Status.BAD_REQUEST).entity(new ErrorMessage(exception.getMessage()))
                        .type(MediaType.APPLICATION_JSON).build();
    }

    /**
     * The Class ErrorMessage.
     */
    public static class ErrorMessage {
        
        /** The error. */
        private String error;

        /**
         * Instantiates a new error message.
         *
         * @param error the error
         */
        public ErrorMessage(String error) {
            this.error = error;
        }

        /**
         * Gets the error.
         *
         * @return the error
         */
        public String getError() {
            return error;
        }
    }
}
