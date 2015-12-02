package com.mitchell.entity.manager;

import java.util.UUID;

import javax.annotation.Nonnull;

import com.mitchell.entity.Entity;

public interface EntityManager<T extends Entity> {

    public void add(@Nonnull T managed) throws DuplicateEntityException, IllegalArgumentException;

    public void update(@Nonnull T managed) throws NonExistentEntityException, IllegalArgumentException;

    public void delete(@Nonnull T managed) throws NonExistentEntityException, IllegalArgumentException;

    public T get(@Nonnull UUID id) throws NonExistentEntityException, IllegalArgumentException;
}
