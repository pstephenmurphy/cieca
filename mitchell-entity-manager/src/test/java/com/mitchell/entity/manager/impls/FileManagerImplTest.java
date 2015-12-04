package com.mitchell.entity.manager.impls;

import static org.junit.Assert.assertNotNull;

import java.util.UUID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mitchell.entity.MockEntity;
import com.mitchell.entity.manager.DuplicateEntityException;
import com.mitchell.entity.manager.EntityManager;
import com.mitchell.entity.manager.NonExistentEntityException;

public class FileManagerImplTest {

    private EntityManager<MockEntity, UUID> manager;
    
    @Before
    public void setUp() throws Exception {
        
        manager = new FileManagerImpl<MockEntity, UUID>(MockEntity.class, ".");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addHappyPath() throws Exception {
        MockEntity entity = new MockEntity();

        manager.add(entity);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNullEntity() throws Exception {
        manager.add(null);
    }

    @Test(expected = DuplicateEntityException.class)
    public void addExistingEntity() throws Exception {
        MockEntity entity = new MockEntity();

        manager.add(entity);
        manager.add(entity);
    }

    @Test
    public void updateHappyPath() throws Exception {
        MockEntity entity = new MockEntity();

        manager.add(entity);
        manager.update(entity);
    }

    @Test(expected = IllegalArgumentException.class)
    public void updateNullEntity() throws Exception {

        manager.update(null);
    }

    @Test(expected = NonExistentEntityException.class)
    public void updateNonExistingEntity() throws Exception {
        MockEntity entity = new MockEntity();

        manager.update(entity);
    }

    @Test
    public void deleteHappyPath() throws Exception {
        MockEntity entity = new MockEntity();

        manager.add(entity);
        manager.delete(entity.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void deleteNullEntity() throws Exception {

        manager.delete(null);
    }

    @Test(expected = NonExistentEntityException.class)
    public void deleteNonExistingEntity() throws Exception {
        MockEntity entity = new MockEntity();

        manager.delete(entity.getID());
    }

    @Test
    public void getHappyPath() throws Exception {
        MockEntity entity = new MockEntity();

        manager.add(entity);
        MockEntity retVal = manager.get(entity.getID());

        assertNotNull(retVal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getNullEntity() throws Exception {

        manager.get(null);
    }

    @Test(expected = NonExistentEntityException.class)
    public void getNonExistingEntity() throws Exception {
        MockEntity entity = new MockEntity();

        manager.get(entity.getID());
    }


}
