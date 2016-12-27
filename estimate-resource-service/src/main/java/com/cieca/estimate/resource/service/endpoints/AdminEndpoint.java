package com.cieca.estimate.resource.service.endpoints;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cieca.entity.manager.EntityManager;
import com.cieca.estimate.resource.entity.admin.AdminInfoType;
import com.cieca.estimate.resource.entity.estimate.EstimateType;

/**
 * The Class AdminEndpoint.
 */
@Path("/estimate")
public class AdminEndpoint extends AbstractEstimateEndpoint {

    /**
     * Instantiates a new admin info endpoint.
     *
     * @param entityManager - the entity manager
     */
    public AdminEndpoint(EntityManager<EstimateType, String> entityManager) {
        super(entityManager);
    }

    /**
     * Find.
     *
     * @param id - the id
     * 
     * @return the response
     */
    @GET
    @Path("/{id:[0-9][0-9]*}/adminInfo")
    @Produces(MediaType.APPLICATION_JSON)
    public Response find(@PathParam("id") final String id) {
        EstimateType estimate = findEstimate(id);
        AdminInfoType adminInfo = (null != estimate ? estimate.getAdminInfo() : null);

        return getResponse(adminInfo);
    }

    /**
     * Update.
     *
     * @param id - the id
     * @param adminInfo - the admin info
     * 
     * @return the response
     */
    @PUT
    @Path("/{id:[0-9][0-9]*}/adminInfo")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") String id, final AdminInfoType adminInfo) {
        return Response.noContent().build();
    }
}
