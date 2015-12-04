package com.mitchell.estimate.resource.service.endpoints;

import com.mitchell.entity.manager.EntityManager;
import com.mitchell.entity.manager.NonExistentEntityException;
import com.mitchell.entity.manager.impls.ManagerHashMapImpl;
import com.mitchell.estimate.resource.entity.estimate.EstimateType;

public abstract class AbstractEstimateEndpoint {

    protected EntityManager<EstimateType, String> entityManager = new ManagerHashMapImpl<EstimateType, String>();

    protected AbstractEstimateEndpoint() {
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
}
