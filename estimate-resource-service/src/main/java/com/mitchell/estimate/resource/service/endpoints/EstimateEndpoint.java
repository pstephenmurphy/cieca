package com.mitchell.estimate.resource.service.endpoints;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mitchell.entity.manager.DuplicateEntityException;
import com.mitchell.entity.manager.NonExistentEntityException;

import com.mitchell.estimate.resource.entity.estimate.EstimateType;

@Path("/estimate")
public class EstimateEndpoint extends AbstractEstimateEndpoint {
    
    @POST
    @Path("/{id:[0-9][0-9]*}")
    @Produces("application/json")
    public Response init(@PathParam("id") final String id) {
        EstimateType estimate = initEstimate(id);
        return Response.ok(estimate).build();
    }

    @GET
    @Path("/{id:[0-9][0-9]*}")
    @Produces("application/json")
    public Response findById(@PathParam("id") final String id) {
        EstimateType estimate = findEstimate(id);
        Response response;
        
        if (estimate == null) {
            response = Response.status(Status.NOT_FOUND).build();
        } else {
            response = Response.ok(estimate).build();
        }
        return response;
    }

    @PUT
    @Path("/{id:[0-9][0-9]*}")
    @Consumes("application/json")
    public Response update(@PathParam("id") String id, final EstimateType estimate) {
        return Response.noContent().build();
    }

    @DELETE
    @Path("/{id:[0-9][0-9]*}")
    public Response deleteById(@PathParam("id") final String id) {
        Boolean result = deleteEstimate(id);
        
        return (true == result ? Response.ok() : Response.status(Status.NOT_FOUND)).build();
    }

    private EstimateType initEstimate(final String id) {
        EstimateType estimate = new EstimateType(id);
        try {
            entityManager.add(estimate);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (DuplicateEntityException e) {
            e.printStackTrace();
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
