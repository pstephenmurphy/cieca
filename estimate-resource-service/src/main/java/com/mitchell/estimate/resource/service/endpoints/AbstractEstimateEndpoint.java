package com.mitchell.estimate.resource.service.endpoints;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.WebApplicationException;

import com.mitchell.entity.manager.EntityManager;
import com.mitchell.entity.manager.NonExistentEntityException;
import com.mitchell.estimate.resource.entity.estimate.EstimateType;

public abstract class AbstractEstimateEndpoint {

    protected EntityManager<EstimateType, String> entityManager;

    protected AbstractEstimateEndpoint(EntityManager<EstimateType, String> entityManager) {
        this.entityManager = entityManager;
    }

    protected EstimateType findEstimate(final String id) {
        EstimateType estimate = null;
        try {
            estimate = entityManager.get(id);
        } catch (IllegalArgumentException e) {
            handleException(e, Status.INTERNAL_SERVER_ERROR);
        } catch (NonExistentEntityException e) {
            handleException(e, Status.NOT_FOUND);
        }
        return estimate;
    }
    
    protected <T> GenericEntity<T> getGeneric(T list) {
        return new GenericEntity<T>(list) {
        };
    }
    
    protected void handleException(Throwable cause, Status status) throws WebApplicationException {
    	throw new WebApplicationException(cause, Response.status(status).build());
    }

    protected <T> Response getResponse(T object) {
    	Response response;
    	if (null == object) {
            response = Response.noContent().build();
        } else {
            response = Response.ok(object).build();
        }
    	return response;
    }
}
