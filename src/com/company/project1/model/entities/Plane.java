package com.company.project1.model.entities;

public abstract class Plane {
    protected String name;//имя самолета
    protected int capacity;//вместимость
    protected int carrying;//грузоподьтемность
    protected int lengthOfFlight;//дальность полета
    protected int fuel;//количество потребляемого топлива

    public Plane(String name, int capacity, int carrying, int lengthOfFlight, int fuel) {
        this.name = name;
        this.capacity = capacity;
        this.carrying = carrying;
        this.lengthOfFlight = lengthOfFlight;
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public int getLengthOfFlight() {
        return lengthOfFlight;
    }

    public void setLengthOfFlight(int lengthOfFlight) {
        this.lengthOfFlight = lengthOfFlight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
