package com.company.lesson3.lesson3_2;

public class WagonSit extends Wagon{
    public WagonSit(int numberOfWagon, int comfort, int people, int luggage) {
        super(numberOfWagon, comfort, people, luggage);
    }

    @Override
    public String toString() {
        return "WagonSit{" +
                "numberOfWagon=" + numberOfWagon +
                ", comfort=" + comfort +
                ", people=" + people +
                ", luggage=" + luggage +
                '}';
    }
}
