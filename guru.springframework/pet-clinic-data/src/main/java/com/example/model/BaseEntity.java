package com.example.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.io.Serializable;


@Data
@MappedSuperclass // base class JPA  , other class will inherit it
public class BaseEntity implements Serializable { // For Pojo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public BaseEntity() {
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BaseEntity;
    }

}
