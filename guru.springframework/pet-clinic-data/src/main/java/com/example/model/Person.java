package com.example.model;

public class Person extends BaseEntity { // For Pojo1
    private String firstName;
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
