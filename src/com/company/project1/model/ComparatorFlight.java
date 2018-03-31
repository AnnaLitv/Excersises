package com.company.project1.model;

import com.company.project1.model.entities.Plane;

import java.util.Comparator;

public class ComparatorFlight implements Comparator<Plane> {
    @Override
    public int compare(Plane o1, Plane o2) {
        if(o1.getLengthOfFlight()<o2.getLengthOfFlight()){
            return -1;
        }else if(o1.getLengthOfFlight()==o2.getLengthOfFlight()){
            return 0;
        }else
            return 1;
    }
}
