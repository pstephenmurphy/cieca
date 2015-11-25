package com.mitchell.estimate.resource.service.endpoint.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mitchell.estimate.resource.dto.estimate.EstimateType;
import com.mitchell.estimate.resource.dto.totals.TotalsInfoType;
import com.mitchell.estimate.resource.dto.vehicle.VehicleInfoType;

@Path("/estimate")
public class EstimateEndpoint {

    @POST
    @Consumes("application/json")
    public Response create(final EstimateType estimate) {
        return Response.status(Status.SERVICE_UNAVAILABLE).build();
    }

    @GET
    @Path("/{id:[0-9][0-9]*}")
    @Produces("application/json")
    public Response findById(@PathParam("id") final Long id) {
        EstimateType estimate = null;
        Response response = null;
        if (estimate == null) {
            response = Response.status(Status.NOT_FOUND).build();
        }
        return response;
    }

    @GET
    @Path("/{id:[0-9][0-9]*}/vehicle")
    @Produces("application/json")
    public Response findVehicleById(@PathParam("id") final Long id) {
        VehicleInfoType vehicle = null;
        Response response = null;
        if (vehicle == null) {
            response = Response.status(Status.NOT_FOUND).build();
        }
        return response;
    }

    @GET
    @Path("/{id:[0-9][0-9]*}/totals")
    @Produces("application/json")
    public Response findTotalsById(@PathParam("id") final Long id) {
        List<TotalsInfoType> totals = null;
        Response response = null;
        if (totals == null) {
            response = Response.status(Status.NOT_FOUND).build();
        }
        return response;
    }

    @GET
    @Produces("application/json")
    public List<EstimateType> listAll(@QueryParam("start") final Integer startPosition, @QueryParam("max") final Integer maxResult) {
        final List<EstimateType> estimates = null;
        return estimates;
    }

    @PUT
    @Path("/{id:[0-9][0-9]*}")
    @Consumes("application/json")
    public Response update(@PathParam("id") Long id, final EstimateType estimate) {
        return Response.noContent().build();
    }

    @DELETE
    @Path("/{id:[0-9][0-9]*}")
    public Response deleteById(@PathParam("id") final Long id) {
        return Response.noContent().build();
    }

}
