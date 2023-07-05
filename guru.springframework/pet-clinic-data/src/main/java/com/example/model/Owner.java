package com.example.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "owners")
public class Owner extends Person { // For Pojo1

    @Column(name = "address")
    private String address;
//    private Set<Pet>  pet;
    @Column(name = "city")
    private String city;
    @Column(name = "telephone")
    private String telephone;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    public Set<Pet> getPets() {
        return pets;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public Set<Pet> getPet() {
//        return pet;
//    }

//    public void setPet(Set<Pet> pet) {
//        this.pet = pet;
//    }

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

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }


}
