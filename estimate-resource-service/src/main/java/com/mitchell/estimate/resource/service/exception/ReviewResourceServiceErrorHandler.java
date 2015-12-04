package com.mitchell.estimate.resource.service.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public final class ReviewResourceServiceErrorHandler implements ExceptionMapper<ReviewResourceServiceException> {

    public ReviewResourceServiceErrorHandler() {
    }

    @Override
    public Response toResponse(final ReviewResourceServiceException exception) {
        return Response.status(Status.BAD_REQUEST).entity(new ErrorMessage(exception.getMessage()))
                        .type(MediaType.APPLICATION_JSON).build();
    }

    public static class ErrorMessage {
        private String error;

        public ErrorMessage(String error) {
            this.error = error;
        }

        public String getError() {
            return error;
        }
    }
}
