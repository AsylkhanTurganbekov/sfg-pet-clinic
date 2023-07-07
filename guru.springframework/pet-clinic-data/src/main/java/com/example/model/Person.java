package com.example.model;

import jakarta.persistence.Access;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.AccessType;

@MappedSuperclass
public class Person extends BaseEntity { // For Pojo1
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
