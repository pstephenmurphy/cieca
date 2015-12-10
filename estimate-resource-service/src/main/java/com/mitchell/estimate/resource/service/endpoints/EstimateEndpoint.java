package com.mitchell.estimate.resource.service.endpoints;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mitchell.entity.manager.DuplicateEntityException;
import com.mitchell.entity.manager.EntityManager;
import com.mitchell.entity.manager.NonExistentEntityException;
import com.mitchell.estimate.resource.entity.estimate.EstimateType;

/**
 * The Class EstimateEndpoint.
 */
@Path("/estimate")
public class EstimateEndpoint extends AbstractEstimateEndpoint {
    
    public EstimateEndpoint(EntityManager<EstimateType, String> entityManager) {
        super(entityManager);
    }

    /**
     * Inits the.
     *
     * @param id the id
     * @return the response
     */
    @POST
    @Path("/{id:[0-9][0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response init(@PathParam("id") final String id) {
        EstimateType estimate = initEstimate(id);
        return Response.ok(estimate).build();
    }

    /**
     * Find.
     *
     * @param id the id
     * @return the response
     */
    @GET
    @Path("/{id:[0-9][0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response find(@PathParam("id") final String id) {
        EstimateType estimate = findEstimate(id);
        
        return getResponse(estimate);
    }

    /**
     * Update.
     *
     * @param id the id
     * @param estimate the estimate
     * @return the response
     */
    @PUT
    @Path("/{id:[0-9][0-9]*}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") String id, final EstimateType estimate) {
        return Response.status(Status.BAD_REQUEST).build();
    }

    /**
     * Delete.
     *
     * @param id the id
     * @return the response
     */
    @DELETE
    @Path("/{id:[0-9][0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") final String id) {
        Boolean result = deleteEstimate(id);
        
        return (true == result ? Response.ok() : Response.status(Status.BAD_REQUEST)).build();
    }

    private EstimateType initEstimate(final String id) {
        EstimateType estimate = new EstimateType(id);
        try {
            entityManager.add(estimate);
        } catch (IllegalArgumentException e) {
        	handleException(e, Status.INTERNAL_SERVER_ERROR);
        } catch (DuplicateEntityException e) {
        	handleException(e, Status.BAD_REQUEST);
        }
        return estimate;
    }
    
    private Boolean deleteEstimate(final String id) {
        Boolean result = true;
        try {
            entityManager.delete(id);
        } catch (IllegalArgumentException e) {
            result = false;
        } catch (NonExistentEntityException e) {
            result = false;
        }
        return result;
    }
}
