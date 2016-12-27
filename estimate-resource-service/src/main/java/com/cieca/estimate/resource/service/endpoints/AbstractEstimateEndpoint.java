package com.cieca.estimate.resource.service.endpoints;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.WebApplicationException;

import com.cieca.entity.manager.EntityManager;
import com.cieca.entity.manager.exceptions.EntityManagerException;
import com.cieca.entity.manager.exceptions.NonExistentEntityException;
import com.cieca.estimate.resource.entity.estimate.EstimateType;

/**
 * The Class AbstractEstimateEndpoint.
 */
public abstract class AbstractEstimateEndpoint {

    protected EntityManager<EstimateType, String> entityManager;

    /**
     * Instantiates a new abstract estimate endpoint.
     *
     * @param entityManager - the entity manager
     */
    protected AbstractEstimateEndpoint(EntityManager<EstimateType, String> entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Find estimate.
     *
     * @param id - the id
     * 
     * @return the estimate type
     */
    protected EstimateType findEstimate(final String id) {
        EstimateType estimate = null;
        try {
            estimate = entityManager.get(id);
        } catch (IllegalArgumentException e) {
            handleException(e, Status.BAD_REQUEST);
        } catch (NonExistentEntityException e) {
            handleException(e, Status.NOT_FOUND);
        } catch (EntityManagerException e) {
            handleException(e, Status.INTERNAL_SERVER_ERROR);
		}
        
        return estimate;
    }
    
    /**
     * Gets the generic.
     *
     * @param <T> - the generic type
     * @param list - the list
     * 
     * @return the generic
     */
    protected <T> GenericEntity<T> getGeneric(final T list) {
        return new GenericEntity<T>(list) {
        };
    }
    
    /**
     * Handle exception.
     *
     * @param cause - the cause
     * @param status - the status
     * 
     * @throws WebApplicationException the web application exception
     */
    protected void handleException(final Throwable cause, final Status status) throws WebApplicationException {
    	throw new WebApplicationException(cause, Response.status(status).build());
    }

    /**
     * Gets the response.
     *
     * @param <T> - the generic type
     * @param object - the generic object
     * 
     * @return the response
     */
    protected <T> Response getResponse(final T object) {
    	Response response;
    	if (null == object) {
            response = Response.noContent().build();
        } else {
            response = Response.ok(object).build();
        }
    	return response;
    }

	/**
	 * Update estimate.
	 *
	 * @param estimate - the estimate
	 */
	protected void updateEstimate(final EstimateType estimate) {
		try {
			entityManager.update(estimate);
		} catch (IllegalArgumentException e) {
			handleException(e, Status.BAD_REQUEST);
		} catch (NonExistentEntityException e) {
			handleException(e, Status.NO_CONTENT);
		} catch (EntityManagerException e) {
            handleException(e, Status.INTERNAL_SERVER_ERROR);
		}
	}
}
