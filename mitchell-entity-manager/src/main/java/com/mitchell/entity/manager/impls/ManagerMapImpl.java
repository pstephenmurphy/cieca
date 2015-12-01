package com.mitchell.entity.manager.impls;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.mitchell.entity.Entity;
import com.mitchell.entity.manager.DuplicateEntityException;
import com.mitchell.entity.manager.Manager;
import com.mitchell.entity.manager.NonExistentEntityException;
import com.mitchell.entity.manager.NullEntityArgumentException;
import com.mitchell.entity.manager.NullUUIDArgumentException;

public abstract class ManagerMapImpl<T extends Entity> implements Manager<T> {

    private Map<UUID, T> managedEntities = new HashMap<UUID, T>();

    @Override
    public void add(T managedEntity) throws DuplicateEntityException, NullEntityArgumentException {
        if (managedEntity != null) {
            if (!managedEntities.containsKey(managedEntity.getID())) {
                this.managedEntities.put(managedEntity.getID(), managedEntity);
            } else {
                throw new DuplicateEntityException();
            }
        } else {
            throw new NullEntityArgumentException();
        }
    }

    @Override
    public void update(T managedEntity) throws NonExistentEntityException, NullEntityArgumentException {
        if (managedEntity != null) {
            if (Boolean.FALSE == this.managedEntities.containsKey(managedEntity.getID())) {
                throw new NonExistentEntityException();
            } else {
                this.managedEntities.put(managedEntity.getID(), managedEntity);
            }
        } else {
            throw new NullEntityArgumentException();
        }
    }

    @Override
    public void delete(T managedEntity) throws NonExistentEntityException, NullEntityArgumentException {
        if (managedEntity != null) {
            if (null == this.managedEntities.remove(managedEntity.getID())) {
                throw new NonExistentEntityException();
            }
        } else {
            throw new NullEntityArgumentException();
        }
    }

    @Override
    public T get(UUID id) throws NonExistentEntityException, NullUUIDArgumentException {
        T entity = null;

        if (id != null) {
            entity = this.managedEntities.get(id);

            if (null == entity) {
                throw new NonExistentEntityException();
            }
        } else {
            throw new NullUUIDArgumentException();
        }

        return entity;
    }
}
