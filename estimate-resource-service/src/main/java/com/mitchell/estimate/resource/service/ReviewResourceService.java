package com.mitchell.estimate.resource.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.mitchell.estimate.resource.service.endpoint.rest.AdminEndpoint;
import com.mitchell.estimate.resource.service.endpoint.rest.EstimateEndpoint;
import com.mitchell.estimate.resource.service.endpoint.rest.ProfileEndpoint;

@ApplicationPath("/review")
public class ReviewResourceService extends Application {

    private Set<Object> singletons = new HashSet<Object>();
    private Set<Class<?>> empty = new HashSet<Class<?>>();

    public ReviewResourceService()
    {
       singletons.add(new AdminEndpoint());
       singletons.add(new EstimateEndpoint());
       singletons.add(new ProfileEndpoint());
    }
    
    @Override
    
    public Set<Class<?>> getClasses()
    {
       return empty;
    }

    @Override
    public Set<Object> getSingletons()
    {
       return singletons;
    }
}
