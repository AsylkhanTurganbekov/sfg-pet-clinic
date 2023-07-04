package com.example.model;

import java.util.Set;

public class Owner extends Person { // For Pojo1

    private String address;
    private Set<Pet>  pet;
    private String city;
    private String telephone;
    private Set<Owner> pets;

    public Set<Owner> getPets() {
        return pets;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setPets(Set<Owner> pets) {
        this.pets = pets;
    }


}
