package com.company.lesson3.lesson3_2;

public class Runner {
    private Train<Wagon> trainSleep;

    public Runner(){
        trainSleep = new Train<>();
    }

    public void run(){
        initalStandart();
        trainSleep.print();
        trainSleep.sortByComfort();
        System.out.println("");
        trainSleep.print();
        System.out.println(trainSleep.getSumOfPeople());
        System.out.println(trainSleep.getSumOfLug());
    }

    private void initalStandart(){
        trainSleep.addWagon(new WagonSleep((int)(Math.random()*1000+1),(int)(Math.random()*5+1),(int)(Math.random()*40+1),(int)(Math.random()*500+1)));
        trainSleep.addWagon(new WagonSit((int)(Math.random()*1000+1),(int)(Math.random()*5+1),(int)(Math.random()*40+1),(int)(Math.random()*500+1)));
        trainSleep.addWagon(new WagonRestoran((int)(Math.random()*1000+1),(int)(Math.random()*5+1),(int)(Math.random()*40+1),(int)(Math.random()*500+1),"McDonalds"));
        trainSleep.addWagon(new WagonSleep((int)(Math.random()*1000+1),(int)(Math.random()*5+1),(int)(Math.random()*40+1),(int)(Math.random()*500+1)));
        trainSleep.addWagon(new WagonSit((int)(Math.random()*1000+1),(int)(Math.random()*5+1),(int)(Math.random()*40+1),(int)(Math.random()*500+1)));
        trainSleep.addWagon(new WagonSit((int)(Math.random()*1000+1),(int)(Math.random()*5+1),(int)(Math.random()*40+1),(int)(Math.random()*500+1)));
        trainSleep.addWagon(new WagonSleep((int)(Math.random()*1000+1),(int)(Math.random()*5+1),(int)(Math.random()*40+1),(int)(Math.random()*500+1)));

    }
}
