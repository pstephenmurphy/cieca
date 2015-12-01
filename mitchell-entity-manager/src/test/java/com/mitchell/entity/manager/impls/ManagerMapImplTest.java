package com.mitchell.entity.manager.impls;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.mitchell.entity.MockEntity;
import com.mitchell.entity.manager.DuplicateEntityException;
import com.mitchell.entity.manager.NonExistentEntityException;
import com.mitchell.entity.manager.NullEntityArgumentException;
import com.mitchell.entity.manager.NullUUIDArgumentException;

public class ManagerMapImplTest {

    @Test
    public void addHappyPath() throws Exception {
        ManagerMapImpl<MockEntity> manager = new MockManagerMapImpl();
        MockEntity entity = new MockEntity();

        manager.add(entity);
    }

    @Test(expected = NullEntityArgumentException.class)
    public void addNullEntity() throws Exception {
        ManagerMapImpl<MockEntity> manager = new MockManagerMapImpl();

        manager.add(null);
    }

    @Test(expected = DuplicateEntityException.class)
    public void addExistingEntity() throws Exception {
        ManagerMapImpl<MockEntity> manager = new MockManagerMapImpl();
        MockEntity entity = new MockEntity();

        manager.add(entity);
        manager.add(entity);
    }

    @Test
    public void updateHappyPath() throws Exception {
        ManagerMapImpl<MockEntity> manager = new MockManagerMapImpl();
        MockEntity entity = new MockEntity();

        manager.add(entity);
        manager.update(entity);
    }

    @Test(expected = NullEntityArgumentException.class)
    public void updateNullEntity() throws Exception {
        ManagerMapImpl<MockEntity> manager = new MockManagerMapImpl();

        manager.update(null);
    }

    @Test(expected = NonExistentEntityException.class)
    public void updateNonExistingEntity() throws Exception {
        ManagerMapImpl<MockEntity> manager = new MockManagerMapImpl();
        MockEntity entity = new MockEntity();

        manager.update(entity);
    }

    @Test
    public void deleteHappyPath() throws Exception {
        ManagerMapImpl<MockEntity> manager = new MockManagerMapImpl();
        MockEntity entity = new MockEntity();

        manager.add(entity);
        manager.delete(entity);
    }

    @Test(expected = NullEntityArgumentException.class)
    public void deleteNullEntity() throws Exception {
        ManagerMapImpl<MockEntity> manager = new MockManagerMapImpl();

        manager.delete(null);
    }

    @Test(expected = NonExistentEntityException.class)
    public void deleteNonExistingEntity() throws Exception {
        ManagerMapImpl<MockEntity> manager = new MockManagerMapImpl();
        MockEntity entity = new MockEntity();

        manager.delete(entity);
    }

    @Test
    public void getHappyPath() throws Exception {
        ManagerMapImpl<MockEntity> manager = new MockManagerMapImpl();
        MockEntity entity = new MockEntity();

        manager.add(entity);
        MockEntity retVal = manager.get(entity.getID());

        assertNotNull(retVal);
    }

    @Test(expected = NullUUIDArgumentException.class)
    public void getNullEntity() throws Exception {
        ManagerMapImpl<MockEntity> manager = new MockManagerMapImpl();

        manager.get(null);
    }

    @Test(expected = NonExistentEntityException.class)
    public void getNonExistingEntity() throws Exception {
        ManagerMapImpl<MockEntity> manager = new MockManagerMapImpl();
        MockEntity entity = new MockEntity();

        manager.get(entity.getID());
    }

}
