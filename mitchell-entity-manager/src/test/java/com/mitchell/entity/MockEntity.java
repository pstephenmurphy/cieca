package com.mitchell.entity;

import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MockEntity")
public class MockEntity implements Entity<UUID> {

    @XmlElement(name = "EntityId")
    private UUID entityId;

    public MockEntity() {
        entityId = null;
    }
    
    public MockEntity(UUID uuid) {
        entityId = uuid;
    }

    @Override
    public UUID getID() {
        return this.entityId;
    }
}
