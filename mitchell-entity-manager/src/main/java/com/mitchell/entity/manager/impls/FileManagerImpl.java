package com.mitchell.entity.manager.impls;

import static com.mitchell.utility.Preconditions.checkArgument;

import java.io.File;
import java.util.UUID;

import javax.annotation.Nonnull;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.mitchell.entity.Entity;
import com.mitchell.entity.manager.DuplicateEntityException;
import com.mitchell.entity.manager.EntityManager;
import com.mitchell.entity.manager.NonExistentEntityException;

public class FileManagerImpl<T extends Entity> implements EntityManager<T> {
	 private File managedFileEntities;
	 private JAXBContext jaxbContext;
	 private Marshaller marshaller;
	 private Unmarshaller unmarshaller;
	 
	 public FileManagerImpl(String path) throws JAXBException
	 {
		 managedFileEntities = new File(path);
		 
		 marshaller = jaxbContext.createMarshaller(); 
		 
		 unmarshaller = jaxbContext.createUnmarshaller();
	 }
	
	@Override
    public void add(@Nonnull T managedEntity) throws DuplicateEntityException, IllegalArgumentException {
        checkArgument(managedEntity != null);
        
        File fileToAdd = new File(managedFileEntities.getAbsolutePath() + File.separator + managedEntity.getID().toString());
        
        if (fileToAdd.exists())
        {
        	throw new DuplicateEntityException();
        }
        
        try{
        	marshaller.marshal(managedEntity, fileToAdd);
        } catch (JAXBException jaxbEx)
        {
        	throw new IllegalArgumentException();
        }
        
    }

    @Override
    public void update(@Nonnull T managedEntity) throws NonExistentEntityException, IllegalArgumentException {
        checkArgument(managedEntity != null);
        
        File fileToAdd = new File(managedFileEntities.getAbsolutePath() + File.separator + managedEntity.getID().toString());
        
        if (!fileToAdd.exists())
        {
        	throw new NonExistentEntityException();
        }
        
        try{
        	marshaller.marshal(managedEntity, fileToAdd);
        } catch (JAXBException jaxbEx)
        {
        	throw new IllegalArgumentException();
        }
    }

    @Override
    public void delete(@Nonnull T managedEntity) throws NonExistentEntityException, IllegalArgumentException {
    	checkArgument(managedEntity != null);
        
    	File fileEntityToDelete = new File(managedFileEntities.getAbsolutePath() + File.separator + managedEntity.getID().toString());
    	
        if (!fileEntityToDelete.exists()) {
            throw new NonExistentEntityException();
        }
        
        fileEntityToDelete.delete();
    }

    @Override
    public T get(@Nonnull UUID filename) throws NonExistentEntityException, IllegalArgumentException {
        T entity = null;
        
        checkArgument(filename != null);
        
        File fileEntityToReturn = new File(managedFileEntities.getAbsolutePath() + File.separator + filename);
        
        if (!fileEntityToReturn.exists())
        {
        	throw new NonExistentEntityException();
        }
        
        try
        {
        	entity = (T) unmarshaller.unmarshal(fileEntityToReturn);
        } catch (JAXBException jaxbEx)
        {
        	throw new NonExistentEntityException();
        }
        
        return entity;
    }
}
