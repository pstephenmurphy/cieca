package com.mitchell.estimate.resource.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.xml.bind.JAXBException;

import com.mitchell.entity.manager.EntityManager;
import com.mitchell.entity.manager.impls.FileManagerImpl;
import com.mitchell.estimate.resource.entity.estimate.EstimateType;
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
        
        EntityManager<EstimateType, String> entityManager;
        try {
            entityManager = new FileManagerImpl<EstimateType, String>(EstimateType.class, "c:/temp");
            
            singletons.add(new EstimateEndpoint(entityManager));
            singletons.add(new AdminEndpoint(entityManager));
            singletons.add(new ProfileEndpoint(entityManager));
            singletons.add(new VehicleEndpoint(entityManager));
            singletons.add(new RepairTotalsEndpoint(entityManager));
            
       } catch (JAXBException e) {
            e.printStackTrace();
        }
        
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
