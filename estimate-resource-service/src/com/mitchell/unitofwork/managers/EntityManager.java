package com.mitchell.unitofwork.managers;

public interface EntityManager {
    
    public void exists();
    
    public void fetch();
    
    public void remove();
    
    public void save();

}
