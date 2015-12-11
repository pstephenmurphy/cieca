package com.mitchell.entity.manager.impls;

import static com.mitchell.utility.Preconditions.checkArgument;

import java.io.File;

import javax.annotation.Nonnull;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.mitchell.entity.Entity;
import com.mitchell.entity.manager.DuplicateEntityException;
import com.mitchell.entity.manager.EntityManager;
import com.mitchell.entity.manager.EntityManagerException;
import com.mitchell.entity.manager.EntityMarshallingException;
import com.mitchell.entity.manager.EntityUnmarshallingException;
import com.mitchell.entity.manager.NonExistentEntityException;

public class FileManagerImpl<T extends Entity<K>, K> implements EntityManager<T, K> {

    private File managedFileEntities;
    private JAXBContext jaxbContext;
    private Class<T> classToBeBound;
    
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;
    
    public FileManagerImpl(@Nonnull final Class<T> classToBeBound, @Nonnull final String path) throws EntityManagerException {
        checkArgument(classToBeBound != null);
        checkArgument(path != null);

        managedFileEntities = new File(path);
        
        this.classToBeBound = classToBeBound;
        
        try {
            jaxbContext = JAXBContext.newInstance(this.classToBeBound);

            marshaller = jaxbContext.createMarshaller();

            unmarshaller = jaxbContext.createUnmarshaller();
        } catch (JAXBException e) {
            throw new EntityManagerException(e);
        }
    }

    @Override
    public void add(@Nonnull T managedEntity) throws EntityManagerException, IllegalArgumentException {
        checkArgument(managedEntity != null);

        File fileToAdd = new File(getFilePath(managedEntity.getID()));

        if (fileToAdd.exists()) {
            throw new DuplicateEntityException();
        }

        try {
            marshaller.marshal(managedEntity, fileToAdd);
        } catch (JAXBException jaxbEx) {
            throw new EntityMarshallingException(jaxbEx);
        }

    }

    @Override
    public void update(@Nonnull T managedEntity) throws EntityManagerException, IllegalArgumentException {
        checkArgument(managedEntity != null);

        File fileToUpdate = new File(getFilePath(managedEntity.getID()));

        if (!fileToUpdate.exists()) {
            throw new NonExistentEntityException();
        }

        try {
            marshaller.marshal(managedEntity, fileToUpdate);
        } catch (JAXBException jaxbEx) {
            throw new EntityMarshallingException(jaxbEx);
        }
    }

    @Override
    public void delete(@Nonnull K id) throws EntityManagerException, IllegalArgumentException {
        checkArgument(id != null);

        File fileEntityToDelete = new File(getFilePath(id));

        if (!fileEntityToDelete.exists()) {
            throw new NonExistentEntityException();
        }

        fileEntityToDelete.delete();
    }

    @Override
    public T get(@Nonnull K id) throws EntityManagerException, IllegalArgumentException {
        T entity = null;

        checkArgument(id != null);

        File fileEntityToReturn = new File(getFilePath(id));

        if (!fileEntityToReturn.exists()) {
            throw new NonExistentEntityException();
        }

        try {
            entity = classToBeBound.cast(unmarshaller.unmarshal(fileEntityToReturn));
        } catch (JAXBException jaxbEx) {
            throw new EntityUnmarshallingException(jaxbEx);
        }

        return entity;
    }

    private String getFilePath(K id) {
        return managedFileEntities.getAbsolutePath() + File.separator + id;
    }

}
