package com.mitchell.entity.manager.impls;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.mitchell.entity.Entity;
import com.mitchell.entity.manager.DuplicateEntityException;
import com.mitchell.entity.manager.Manager;
import com.mitchell.entity.manager.NonExistentEntityException;

public abstract class ManagerMapImpl<T extends Entity> implements Manager<T> {

	private Map<UUID, T> managedEntities = new HashMap<UUID, T>();

	@Override
	public void add(T managedEntity) throws DuplicateEntityException {
		if (!managedEntities.containsKey(managedEntity.getID())) {
			this.managedEntities.put(managedEntity.getID(), managedEntity);
		} else {
			throw new DuplicateEntityException();
		}
	}

	@Override
	public void update(T managedEntity) throws NonExistentEntityException {
		if (Boolean.FALSE == this.managedEntities.containsKey(managedEntity.getID())) {
			throw new NonExistentEntityException();
		} else {
		    this.managedEntities.put(managedEntity.getID(), managedEntity);
		}
	}

	@Override
	public void delete(T managedEntity) throws NonExistentEntityException {
		if (null == this.managedEntities.remove(managedEntity.getID())) {
			throw new NonExistentEntityException();
		}
	}

	@Override
	public T get(UUID id) throws NonExistentEntityException {
		T entity = this.managedEntities.get(id);
		
		if (null == entity) {
			throw new NonExistentEntityException();
		}
		
		return entity;
	}
}
