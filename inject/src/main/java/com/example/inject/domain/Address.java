package com.example.inject.domain;

public class Address {

    private int postcode;

    private String location;

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postcode=" + postcode +
                ", location='" + location + '\'' +
                '}';
    }
}
