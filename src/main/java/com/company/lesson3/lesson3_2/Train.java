package com.company.lesson3.lesson3_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Train<T extends Wagon> {

    ArrayList<T> wagons;

    Train(){
        wagons = new ArrayList<>();
    }

    public void addWagon(T wagon){
        wagons.add(wagon);
    }

    public void sortByComfort(){
        Collections.sort(wagons, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return Integer.compare(o1.getComfort(),o2.getComfort());
            }
        });
    }

    public int getSumOfPeople(){
        int sum=0;
        for (T wag: wagons) {
            sum=sum+wag.getPeople();
        }
        return sum;
    }

    public int getSumOfLug(){
        int sum=0;
        for (T wag: wagons){
            sum=sum+wag.getLuggage();
        }
        return sum;
    }

    public ArrayList<T> getPeopleInDiapason(int start, int end) {
        ArrayList<T> wags = new ArrayList<>();
        for(T wag: wagons){
            if(wag.getPeople()>=start&wag.getPeople()<=end)
                wags.add(wag);
        }
        return wags;
    }

    public ArrayList<T> getLuggageInDiapason(int start, int end) {
        ArrayList<T> wags = new ArrayList<>();
        for(T wag: wagons){
            if(wag.getLuggage()>=start&wag.getLuggage()<=end)
                wags.add(wag);
        }
        return wags;
    }

    public void print(){
        for (T wag:wagons) {
            System.out.println(wag.toString());
        }
    }
}
