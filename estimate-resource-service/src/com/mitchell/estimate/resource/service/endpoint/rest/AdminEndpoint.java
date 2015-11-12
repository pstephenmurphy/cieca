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

import com.mitchell.estimate.resource.dto.admin.AdminInfoType;

@Path("/estimate")
public class AdminEndpoint {

    @POST
    @Path("/{id:[0-9][0-9]*/admin}")
    @Consumes("application/json")
    public Response create(@PathParam("id") final Long id, final AdminInfoType admininfotype) {
        return Response.status(Status.METHOD_NOT_ALLOWED).build();
    }

    @GET
    @Path("/{id:[0-9][0-9]*/admin}")
    @Produces("application/json")
    public Response findById(@PathParam("id") final Long id) {
        AdminInfoType admininfotype = null;
        Response response = null;
        if (admininfotype == null) {
            response = Response.status(Status.NOT_FOUND).build();
        }
        return response;
    }

    @PUT
    @Path("/{id:[0-9][0-9]*/admin}")
    @Consumes("application/json")
    public Response update(@PathParam("id") Long id, final AdminInfoType admininfotype) {
        return Response.noContent().build();
    }
}
