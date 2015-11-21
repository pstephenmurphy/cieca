/**
 * 
 */
package com.mitchell.estimate.resource.service.endpoint.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mitchell.estimate.resource.dto.profile.ProfileInfoType;

/**
 * @author pm104238
 *
 */
@Path("/estimate")
public class ProfileEndpoint {

    /**
     * @param profileinfotype
     * @return
     */
    @POST
    @Path("/{id:[0-9][0-9]*/profile}")
    @Consumes("application/json")
    public Response create(@PathParam("id") final Long id, final ProfileInfoType profileinfotype) {
        return Response.status(Status.METHOD_NOT_ALLOWED).build();
    }

    /**
     * @param id
     * @return
     */
    @GET
    @Path("/{id:[0-9][0-9]*/profile}")
    @Produces("application/json")
    public Response findById(@PathParam("id") final Long id) {
        ProfileInfoType profileinfotype = null;
        Response response = null;
        if (profileinfotype == null) {
            response = Response.status(Status.NOT_FOUND).build();
        }
        return response;
    }

    /**
     * @param id
     * @param profileinfotype
     * @return
     */
    @PUT
    @Path("/{id:[0-9][0-9]*/profile}")
    @Consumes("application/json")
    public Response update(@PathParam("id") Long id, final ProfileInfoType profileinfotype) {
        return Response.noContent().build();
    }
}
