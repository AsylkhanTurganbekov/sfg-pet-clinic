package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person extends BaseEntity { // For Pojo1

    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
