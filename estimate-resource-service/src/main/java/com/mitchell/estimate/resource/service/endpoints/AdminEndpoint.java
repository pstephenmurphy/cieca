package com.mitchell.estimate.resource.service.endpoints;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mitchell.entity.manager.EntityManager;
import com.mitchell.estimate.resource.entity.admin.AdminInfoType;
import com.mitchell.estimate.resource.entity.estimate.EstimateType;

@Path("/estimate")
public class AdminEndpoint extends AbstractEstimateEndpoint {

    public AdminEndpoint(EntityManager<EstimateType, String> entityManager) {
        super(entityManager);
    }

    @GET
    @Path("/{id:[0-9][0-9]*/adminInfo}")
    @Produces("application/json")
    public Response findById(@PathParam("id") final String id) {
        EstimateType estimate = findEstimate(id);
        AdminInfoType adminInfo = (null != estimate ? estimate.getAdminInfo() : null);
        
        Response response = null;
        if (adminInfo == null) {
            response = Response.status(Status.NOT_FOUND).build();
        } else {
            response = Response.ok(adminInfo).build();
        }
        return response;
    }

    @PUT
    @Path("/{id:[0-9][0-9]*/adminInfo}")
    @Consumes("application/json")
    public Response update(@PathParam("id") String id, final AdminInfoType adminInfo) {
        return Response.noContent().build();
    }
}
