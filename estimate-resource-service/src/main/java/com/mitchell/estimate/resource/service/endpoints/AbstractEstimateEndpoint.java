package com.mitchell.estimate.resource.service.endpoints;

import javax.ws.rs.core.GenericEntity;

import com.mitchell.entity.manager.EntityManager;
import com.mitchell.entity.manager.NonExistentEntityException;
import com.mitchell.estimate.resource.entity.estimate.EstimateType;

public abstract class AbstractEstimateEndpoint {

    protected EntityManager<EstimateType, String> entityManager;

    protected AbstractEstimateEndpoint(EntityManager<EstimateType, String> entityManager) {
        this.entityManager = entityManager;
    }

    protected EstimateType findEstimate(final String id) {
        EstimateType estimate = null;
        try {
            estimate = entityManager.get(id);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (NonExistentEntityException e) {
            e.printStackTrace();
        }
        return estimate;
    }
    
    protected <T> GenericEntity<T> getGeneric(T list) {
        return new GenericEntity<T>(list) {
        };
    }
}
