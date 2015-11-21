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

    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        
        classes.add(AdminEndpoint.class);
        classes.add(EstimateEndpoint.class);
        classes.add(ProfileEndpoint.class);
        
        return classes;
    }
}
