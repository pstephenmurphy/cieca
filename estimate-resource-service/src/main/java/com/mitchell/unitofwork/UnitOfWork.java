package com.mitchell.unitofwork;

public interface UnitOfWork {
    
    public void cancel();
    
    public void checkIn();
    
    public void checkOut();
    
    public void merge();
    
    public void rollback();
}
