package com.company.project1.model.entities;

public class RegionalPlane extends PassengerPlane {

    public RegionalPlane(String name, int capacity, int carrying, int lengthOfFlight, int fuel) {
        super(name, capacity, carrying, lengthOfFlight, fuel);
        this.food = false;//питание отсутствует
    }
}
