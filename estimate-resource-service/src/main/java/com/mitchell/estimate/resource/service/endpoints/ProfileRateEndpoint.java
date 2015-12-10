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
 * The Class ProfileRateEndpoint.
 *
 * @author pm104238(Steve Murphy)
 */
@Path("/estimate")
public class ProfileRateEndpoint extends AbstractEstimateEndpoint {
    
    public ProfileRateEndpoint(EntityManager<EstimateType, String> entityManager) {
        super(entityManager);
    }

    /**
     * Find
     *
     * @param id - the id
     * 
     * @return the list
     */
    @GET
    @Path("/{id:[0-9][0-9]*}/profile/rates")
    @Produces(MediaType.APPLICATION_JSON)
    public List<RateInfoType> find(@PathParam("id") final String id) {
        EstimateType estimate = findEstimate(id);
        ProfileInfoType profileInfo = getProfile(estimate);
        List<RateInfoType> rateInfos = profileInfo.getRateInfo();
        
        @SuppressWarnings("unused")
		Response response = getResponse(rateInfos);
        
        return rateInfos;
    }

    /**
     * Find
     *
     * @param id - the id
     * @param index - the index
     * 
     * @return the response
     */
    @GET
    @Path("/{id:[0-9][0-9]*}/profile/rate/{index:[0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response find(@PathParam("id") final String id, @PathParam("index") final Integer index) {
        EstimateType estimate = findEstimate(id);
        ProfileInfoType profileInfo = getProfile(estimate);
                
        return getResponse(getRate(index, profileInfo));
    }

    /**
     * Update.
     *
     * @param id - the id
     * @param rateInfo - the rate info
     * 
     * @return the response
     */
    @PUT
    @Path("/{id:[0-9][0-9]*}/profile/rate")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") final String id, final List<RateInfoType> rateInfos) {
    	updateRates(id, rateInfos);
		
		return Response.ok().build();
    }

	/**
     * Update.
     *
     * @param id - the id
     * @param index - the index
     * @param rateInfo - the rate info
     * 
     * @return the response
     */
    @PUT
    @Path("/{id:[0-9][0-9]*}/profile/rate/{index:[0-9]+}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") final String id, @PathParam("index") final Integer index, final RateInfoType rateInfo) {
    	return getResponse(updateRate(id, index, rateInfo));
    }

	private RateInfoType getRate(final Integer index, final ProfileInfoType profileInfo) {
		RateInfoType rateInfo = null;
		try {
            rateInfo = profileInfo.getRateInfo().get(index);
        } catch (IndexOutOfBoundsException e) {
        	handleException(e, Status.INTERNAL_SERVER_ERROR);
        }
		return rateInfo;
	}

	private void updateRates(final String id, final List<RateInfoType> rateInfos) {
		EstimateType estimate = findEstimate(id);    
    	ProfileInfoType profileInfo = getProfile(estimate);
		List<RateInfoType> currentRates = profileInfo.getRateInfo();

		currentRates.clear();
		currentRates.addAll(rateInfos);
		
		updateEstimate(estimate);
	}

	private RateInfoType updateRate(final String id, final Integer index, final RateInfoType rateInfo) {
    	RateInfoType currentRate = rateInfo;
    	Integer currentIndex = index;

    	EstimateType estimate = findEstimate(id);    
    	ProfileInfoType profileInfo = getProfile(estimate);
		List<RateInfoType> rateInfos = profileInfo.getRateInfo();

    	currentRate = getRate(rateInfos, index);

    	if (null == currentRate) {
    		currentIndex = 0;
    	}

    	rateInfos.set(currentIndex, currentRate);

		updateEstimate(estimate);

		return currentRate;
	}
	
	private ProfileInfoType getProfile(final EstimateType estimate) {
		ProfileInfoType profileInfo = estimate.getProfileInfo();
		
		profileInfo = new ProfileInfoType();
		estimate.setProfileInfo(profileInfo);
		
		return profileInfo;
	}
  
	private RateInfoType getRate(final List<RateInfoType> rateInfos, final Integer index) {
		RateInfoType rateInfo = null;
		
		try {
			rateInfo = rateInfos.get(index);
		} catch (IndexOutOfBoundsException e) {
			handleException(e, Status.INTERNAL_SERVER_ERROR);
		}
		
		return rateInfo;
	}

}
