package com.company.lesson3.lesson3_2;

public abstract class Wagon {
    int numberOfWagon;
    int comfort;
    int people;
    int luggage;

    public Wagon(int numberOfWagon, int comfort, int people, int luggage) {
        this.numberOfWagon = numberOfWagon;
        this.comfort = comfort;
        this.people = people;
        this.luggage = luggage;
    }

    public int getNumberOfWagon() {
        return numberOfWagon;
    }

    public int getComfort() {
        return comfort;
    }

    public int getPeople() {
        return people;
    }

    public int getLuggage() {
        return luggage;
    }
}
