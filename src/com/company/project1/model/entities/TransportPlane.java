package com.company.project1.model.entities;

public class TransportPlane extends Plane {
    protected String kindOfgoods;//тип перевозимых грузов

    public TransportPlane(String name, int capacity, int carrying, int lengthOfFlight, int fuel, String kindOfgoods) {
        super(name, capacity, carrying, lengthOfFlight, fuel);
        this.kindOfgoods = kindOfgoods;
    }

    public String getKindOfgoods() {
        return kindOfgoods;
    }

    public void setKindOfgoods(String kindOfgoods) {
        this.kindOfgoods = kindOfgoods;
    }

    @Override
    public String toString() {
        return "TransportPlane{" +
                "kindOfgoods='" + kindOfgoods + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", carrying=" + carrying +
                ", lengthOfFlight=" + lengthOfFlight +
                ", fuel=" + fuel +
                '}';
    }

}
