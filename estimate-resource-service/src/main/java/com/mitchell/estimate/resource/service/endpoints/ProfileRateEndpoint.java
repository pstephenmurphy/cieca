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
import com.mitchell.estimate.resource.entity.profile.ProfileInfoType;
import com.mitchell.estimate.resource.entity.rate.RateInfoType;

/**
 * @author pm104238
 *
 */
@Path("/estimate")
public class ProfileRateEndpoint extends AbstractEstimateEndpoint {
    
    public ProfileRateEndpoint(EntityManager<EstimateType, String> entityManager) {
        super(entityManager);
    }

    /**
     * @param id
     * @return
     */
    @GET
    @Path("/{id:[0-9][0-9]*}/profile/rates")
    @Produces(MediaType.APPLICATION_JSON)
    public List<RateInfoType> findById(@PathParam("id") final String id) {
        EstimateType estimate = findEstimate(id);
        List<RateInfoType> rateInfos = (null != estimate) ? getProfileRate(estimate) : null;

        @SuppressWarnings("unused")
		Response response = getResponse(rateInfos);
        
        return rateInfos;
    }

    @GET
    @Path("/{id:[0-9][0-9]*}/profile/rate/{index:[0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findRepairTotalByIdAndIndex(@PathParam("id") final String id, @PathParam("index") final Integer index) {
        EstimateType estimate = findEstimate(id);
        List<RateInfoType> rateInfos = (null != estimate) ? getProfileRate(estimate) : null;
        
        RateInfoType rateInfo = null;
        
        try {
            rateInfo = rateInfos.get(index);
        } catch (IndexOutOfBoundsException e) {
        	handleException(e, Status.INTERNAL_SERVER_ERROR);
        }
        
        return getResponse(rateInfo);
    }

    /**
     * @param id
     * @param profileinfotype
     * @return
     */
    @PUT
    @Path("/{id:[0-9][0-9]*}/profile/rate")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") String id, final List<RateInfoType> repairTotals) {
        return Response.noContent().build();
    }
    
    @PUT
    @Path("/{id:[0-9][0-9]*}/profile/rate/{index:[0-9]+}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") String id, @PathParam("index") final Integer index, final RateInfoType repairTotal) {
        return Response.noContent().build();
    }

    private List<RateInfoType> getProfileRate(EstimateType estimate) {
        ProfileInfoType profileInfo = estimate.getProfileInfo();
        return (null == profileInfo) ? null : profileInfo.getRateInfo();
    }
}
