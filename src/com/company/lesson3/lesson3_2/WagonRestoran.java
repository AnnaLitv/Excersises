package com.company.lesson3.lesson3_2;

public class WagonRestoran extends Wagon{
    String name;

    public WagonRestoran(int numberOfWagon, int comfort, int people, int luggage, String name) {
        super(numberOfWagon, comfort, people, luggage);
        this.name = name;
    }

    @Override
    public String toString() {
        return "WagonRestoran{" +
                "name='" + name + '\'' +
                ", numberOfWagon=" + numberOfWagon +
                ", comfort=" + comfort +
                ", people=" + people +
                ", luggage=" + luggage +
                '}';
    }
}
