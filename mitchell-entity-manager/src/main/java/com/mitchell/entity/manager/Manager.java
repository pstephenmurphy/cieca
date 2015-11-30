package com.mitchell.entity.manager;

import java.util.UUID;

import com.mitchell.entity.Entity;

public interface Manager<T extends Entity> {
	
	public void add(T managed) throws DuplicateEntityException;
	
	public void update(T managed) throws NonExistentEntityException;
	
	public void delete(T managed) throws NonExistentEntityException;
	
	public T get(UUID id) throws NonExistentEntityException;
}
