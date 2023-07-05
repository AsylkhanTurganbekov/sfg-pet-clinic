package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass

public class Person extends BaseEntity { // For Pojo1
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String LasNamel;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasNamel() {
        return LasNamel;
    }

    public void setLasNamel(String lasNamel) {
        LasNamel = lasNamel;
    }
}
