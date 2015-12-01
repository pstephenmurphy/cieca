/**
 * 
 */
package com.mitchell.unitofwork.service.endpoint.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mitchell.unitofwork.UnitOfWork;

/**
 * @author pm104238
 *
 */
@Path("/unitofwork")
public class UnitOfWorkEndpoint {

    /**
     * @return
     */
    @POST
    @Path("/{id:[0-9][0-9]*}")
    @Consumes("application/json")
    public Response create(@PathParam("id") final Long id) {
        return Response.status(Status.SERVICE_UNAVAILABLE).build();
    }

    /**
     * @param id
     * @return
     */
    @GET
    @Path("/{id:[0-9][0-9]*}")
    @Produces("application/json")
    public Response findById(@PathParam("id") final Long id) {
        UnitOfWork unitOfWork = null;
        Response response = null;
        if (unitOfWork == null) {
            response = Response.status(Status.NOT_FOUND).build();
        }
        return response;
    }

    /**
     * @param id
     * @return
     */
    @PUT
    @Path("/{id:[0-9][0-9]*}")
    @Consumes("application/json")
    public Response update(@PathParam("id") Long id) {
        return Response.noContent().build();
    }
}
