package com.company.project1.model.entities;

public class InternationalPlane extends PassengerPlane {

    public InternationalPlane(String name, int capacity, int carrying, int lengthOfFlight, int fuel) {
        super(name, capacity, carrying, lengthOfFlight, fuel);
        this.food = true;
    }
}
