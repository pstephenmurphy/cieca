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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mitchell.entity.manager.EntityManager;

import com.mitchell.estimate.resource.entity.estimate.EstimateType;
import com.mitchell.estimate.resource.entity.totals.RepairTotalsInfoType;

/**
 * @author pm104238
 *
 */
@Path("/estimate")
public class RepairTotalsEndpoint extends AbstractEstimateEndpoint {
    
    public RepairTotalsEndpoint(EntityManager<EstimateType, String> entityManager) {
        super(entityManager);
    }

    /**
     * @param id
     * @return
     */
    @GET
    @Path("/{id:[0-9][0-9]*}/repairTotals")
    @Produces(MediaType.APPLICATION_JSON)
    public List<RepairTotalsInfoType> findById(@PathParam("id") final String id) {
        EstimateType estimate = findEstimate(id);
        List<RepairTotalsInfoType> repairTotals = (null != estimate ? estimate.getRepairTotalsInfo() : null);

        @SuppressWarnings("unused")
		Response response = getResponse(repairTotals);
        
        return repairTotals;
    }

    @GET
    @Path("/{id:[0-9][0-9]*}/repairTotal/{index:[0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findRepairTotalByIdAndIndex(@PathParam("id") final String id, @PathParam("index") final Integer index) {
        EstimateType estimate = findEstimate(id);
        List<RepairTotalsInfoType> repairTotals = (null != estimate ? estimate.getRepairTotalsInfo() : null);
        
        RepairTotalsInfoType repairTotalsInfo = null;
        
        try {
            repairTotalsInfo = repairTotals.get(index);
        } catch (IndexOutOfBoundsException e) {
        	handleException(e, Status.INTERNAL_SERVER_ERROR);
        }
        
        return getResponse(repairTotalsInfo);
    }

    /**
     * @param id
     * @param profileinfotype
     * @return
     */
    @PUT
    @Path("/{id:[0-9][0-9]*}/repairTotals")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") String id, final List<RepairTotalsInfoType> repairTotals) {
        return Response.noContent().build();
    }
}
