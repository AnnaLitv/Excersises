package com.company.lesson2;

import java.util.Comparator;

public class ComparatorPerson implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
