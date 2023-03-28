package com.example.spring.listener.entity;

import com.example.spring.database.entity.Company;
import lombok.Getter;

import java.util.EventObject;

public class EntityEvent extends EventObject {
@Getter
    private final Company accessType;
    public EntityEvent(Company accessType, Object entity) {
        super(entity);
        this.accessType = accessType;
    }
}
