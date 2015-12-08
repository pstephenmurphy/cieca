package com.mitchell.estimate.resource.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.mitchell.estimate.resource.service.endpoints.AdminEndpoint;
import com.mitchell.estimate.resource.service.endpoints.EstimateEndpoint;
import com.mitchell.estimate.resource.service.endpoints.ProfileEndpoint;
import com.mitchell.estimate.resource.service.endpoints.RepairTotalsEndpoint;
import com.mitchell.estimate.resource.service.endpoints.VehicleEndpoint;

@ApplicationPath("")
public class ReviewResourceService extends Application {

    private Set<Object> singletons = new HashSet<Object>();
    private Set<Class<?>> empty = new HashSet<Class<?>>();

    public ReviewResourceService() {
        singletons.add(new EstimateEndpoint());
        singletons.add(new AdminEndpoint());
        singletons.add(new ProfileEndpoint());
        singletons.add(new VehicleEndpoint());
        singletons.add(new RepairTotalsEndpoint());
    }

    @Override
    public Set<Class<?>> getClasses() {
        return empty;
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
