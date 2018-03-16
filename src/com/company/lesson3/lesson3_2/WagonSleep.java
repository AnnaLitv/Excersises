package com.company.lesson3.lesson3_2;

public class WagonSleep extends Wagon{

    public WagonSleep(int numberOfWagon, int comfort, int people, int luggage) {
        super(numberOfWagon, comfort, people, luggage);
    }

    @Override
    public String toString() {
        return "WagonSleep{" +
                "numberOfWagon=" + numberOfWagon +
                ", comfort=" + comfort +
                ", people=" + people +
                ", luggage=" + luggage +
                '}';
    }
}
