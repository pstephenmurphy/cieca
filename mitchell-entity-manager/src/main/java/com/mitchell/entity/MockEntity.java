package com.mitchell.entity;

import java.util.UUID;

public class MockEntity implements Entity {

    private UUID entityId;

    public MockEntity() {
        entityId = UUID.randomUUID();
    }

    @Override
    public UUID getID() {
        return this.entityId;
    }

}
