package com.example.model;

import java.io.Serializable;

public class BaseEntity implements Serializable { // For Pojo
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
