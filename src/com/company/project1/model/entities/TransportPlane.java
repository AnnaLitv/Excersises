package com.company.project1.model.entities;

public class TransportPlane extends Plane {
    protected String kindOfgoods;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransportPlane that = (TransportPlane) o;

        return kindOfgoods != null ? kindOfgoods.equals(that.kindOfgoods) : that.kindOfgoods == null;
    }

    @Override
    public int hashCode() {
        return kindOfgoods != null ? kindOfgoods.hashCode() : 0;
    }
}
