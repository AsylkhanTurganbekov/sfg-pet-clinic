package com.example.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class  Vet  extends Person { // For Pojo1

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties",
            joinColumns = @JoinColumn(name= "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    public Set<Speciality> getSpecialitySet() {
        return specialitySet;
    }

    public void setSpecialitySet(Set<Speciality> specialitySet) {
        this.specialitySet = specialitySet;
    }

    private Set<Speciality> specialitySet = new HashSet<>();
}
