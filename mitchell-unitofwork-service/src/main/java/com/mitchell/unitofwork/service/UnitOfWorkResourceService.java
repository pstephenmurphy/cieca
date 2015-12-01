package com.mitchell.unitofwork.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.mitchell.unitofwork.service.endpoint.rest.UnitOfWorkEndpoint;

@ApplicationPath("/")
public class UnitOfWorkResourceService extends Application {

    private Set<Object> singletons = new HashSet<Object>();
    private Set<Class<?>> empty = new HashSet<Class<?>>();

    public UnitOfWorkResourceService()
    {
       singletons.add(new UnitOfWorkEndpoint());
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
