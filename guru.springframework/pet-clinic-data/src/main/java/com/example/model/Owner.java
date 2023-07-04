package com.example.model;

import java.util.Set;

public class Owner extends Person { // For Pojo1
    public Set<Owner> getPets() {
        return pets;
    }

    public void setPets(Set<Owner> pets) {
        this.pets = pets;
    }

    private Set<Owner> pets;
}
