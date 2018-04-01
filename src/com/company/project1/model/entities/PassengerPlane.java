package com.company.project1.model.entities;

public abstract class PassengerPlane extends Plane {
    protected boolean food;

    public PassengerPlane(String name, int capacity, int carrying, int lengthOfFlight, int fuel) {
        super(name, capacity, carrying, lengthOfFlight, fuel);
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "food=" + food +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", carrying=" + carrying +
                ", lengthOfFlight=" + lengthOfFlight +
                ", fuel=" + fuel +
                '}';
    }
}
