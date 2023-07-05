package com.example.model;

import java.util.HashSet;
import java.util.Set;

public class  Vet  extends Person { // For Pojo1
    public Set<Speciality> getSpecialitySet() {
        return specialitySet;
    }

    public void setSpecialitySet(Set<Speciality> specialitySet) {
        this.specialitySet = specialitySet;
    }

    private Set<Speciality> specialitySet = new HashSet<>();
}
