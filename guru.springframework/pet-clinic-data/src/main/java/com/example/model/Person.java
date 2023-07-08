package com.example.model;

import jakarta.persistence.Access;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.AccessType;

@MappedSuperclass
@Getter
@Setter
public class Person extends BaseEntity { // For Pojo1
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
}
