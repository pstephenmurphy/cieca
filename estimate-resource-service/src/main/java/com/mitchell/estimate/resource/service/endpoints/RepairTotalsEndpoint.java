/**
 * 
 */
package com.mitchell.estimate.resource.service.endpoints;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mitchell.estimate.resource.entity.estimate.EstimateType;
import com.mitchell.estimate.resource.entity.totals.RepairTotalsInfoType;

/**
 * @author pm104238
 *
 */
@Path("/estimate")
public class RepairTotalsEndpoint extends AbstractEstimateEndpoint {
    
    /**
     * @param id
     * @return
     */
    @GET
    @Path("/{id:[0-9][0-9]*/repairTotals}")
    @Produces("application/json")
    public Response findById(@PathParam("id") final String id) {
        EstimateType estimate = findEstimate(id);
        List<RepairTotalsInfoType> repairTotals = (null != estimate ? estimate.getRepairTotalsInfo() : null);
        
        Response response;
        
        if (repairTotals == null) {
            response = Response.status(Status.NOT_FOUND).build();
        } else {
            response = Response.ok(repairTotals).build();
        }
        
        return response;
    }

    /**
     * @param id
     * @param profileinfotype
     * @return
     */
    @PUT
    @Path("/{id:[0-9][0-9]*/repairTotals}")
    @Consumes("application/json")
    public Response update(@PathParam("id") String id, final List<RepairTotalsInfoType> repairTotals) {
        return Response.noContent().build();
    }
}
